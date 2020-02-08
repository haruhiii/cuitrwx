package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Studentdata;
import cn.cuitrwx.database.service.StudentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentdataController {
    @Autowired
    private StudentDataService studentDataService;

    public StudentdataController(StudentDataService studentDataService) {
        this.studentDataService = studentDataService;
    }

    @GetMapping("/studentdata")
    DataResponseVO<Studentdata> getStudent(String id) {
        return studentDataService.getStudentData(id);
    }

    @PostMapping("/studentdata")
    DataResponseVO PostStudent(Studentdata studentdata) {

        return studentDataService.postStudentData(studentdata);
    }

    @DeleteMapping("/studentdata")
    DataResponseVO deleteStudent(String id) {

        return studentDataService.deleteStudentData(id);
    }

    @PutMapping("/studentdata")
    DataResponseVO putStudent(Studentdata studentdata) {

        return studentDataService.putStudentData(studentdata);
    }


}
