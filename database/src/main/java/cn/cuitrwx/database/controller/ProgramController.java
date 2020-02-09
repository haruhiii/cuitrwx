package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Program;
import cn.cuitrwx.database.service.StudyAbroadProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramController {
    @Autowired
    private StudyAbroadProgramService studyAbroadProgramService;

    @GetMapping("/getProgram")
    DataResponseVO<Program> getProgra(String overseas_study_id) {
        return studyAbroadProgramService.getProgram(overseas_study_id);
    }
    @GetMapping("/getAllProgram")
    DataResponseVO<List<Program>> getAllProgramTable() {
        return studyAbroadProgramService.getAllProgram();
    }


}
