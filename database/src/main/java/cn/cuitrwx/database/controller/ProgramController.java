package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.ProgramPO;
import cn.cuitrwx.database.service.ProgramService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping("/programs")
    public  DataResponseVO<List<ProgramPO>> getPrograms(){
        try {
            List programs = programService.getPrograms();
            return programs==null||programs.size()==0?
                 new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(programs);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PutMapping("/program")
    public DataResponseVO<Integer> putProgram(@RequestBody ProgramPO newProgram) {
        try {
            Integer result = programService.putProgram(newProgram);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/program")
    public DataResponseVO<Integer> postProgram(@RequestBody ProgramPO newProgram) {
        try {
            Integer result = programService.postProgram(newProgram);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @DeleteMapping("/program")
    public DataResponseVO<Integer> deleteProgram(@RequestParam Integer id ) {
        try {
            Integer result = programService.deleteProgram(id);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

}
