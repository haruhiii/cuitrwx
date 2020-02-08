package cn.cuitrwx.database.controller;


import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.StudyAbroad;
import cn.cuitrwx.database.service.StudyAbroadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudyabroadController {
    @Autowired
    private StudyAbroadService StudentDataService;

    @GetMapping("/StudyAbroad")
    DataResponseVO<StudyAbroad> getStudent(String studentid) {
        return StudentDataService.getStudent(studentid);
    }

    @PostMapping("/StudyAbroad")
    DataResponseVO PostStudent(StudyAbroad studyabroad) {
        return StudentDataService.postStudent(studyabroad);
    }

    @DeleteMapping("/StudyAbroad")
    DataResponseVO deleteStudent(String studentid) {
        return StudentDataService.deleteStudent(studentid);
    }

    @PutMapping("/StudyAbroad")
    DataResponseVO putStudent(StudyAbroad studyabroad) {
        return StudentDataService.putStudent(studyabroad);
    }

}
