package cn.cuitrwx.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.mapper.ProgramMapper;
import cn.cuitrwx.database.model.PO.Program;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

@RestController
public class ProgramController {

    @Autowired
    private ProgramMapper programMapper;

    @GetMapping("/programs")
    public  DataResponse<List<Program>> getPrograms(){
        try {
            List programs = programMapper.getPrograms();
            return programs==null||programs.size()==0?
                 new DataResponse<>(ErrorCode.EMPTY):new DataResponse<>(programs);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    @PutMapping("/program")
    public DataResponse<Integer> putProgram(@RequestBody Program newProgram) {
        try {
            Integer result = programMapper.putProgram(newProgram);
            return result!=1?
                 new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/program")
    public DataResponse<Integer> postProgram(@RequestBody Program newProgram) {
        try {
            Integer result = programMapper.postProgram(newProgram);
            return result!=1?
                 new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @DeleteMapping("/program")
    public DataResponse<Integer> deleteProgram(@RequestParam Integer id ) {
        try {
            Integer result = programMapper.deleteProgram(id);
            return result!=1?
                 new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

}
