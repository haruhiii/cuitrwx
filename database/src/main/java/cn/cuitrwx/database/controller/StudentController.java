package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.StudentPO;
import cn.cuitrwx.database.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    
    @GetMapping("/student")
    DataResponseVO<StudentPO> getStudent(@RequestParam("openid") String openid){
        try {
            StudentPO student = studentService.getStudent(openid);
            return student==null?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(student);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @GetMapping("/students")
    DataResponseVO<List<StudentPO>> getStudents(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List students = studentService.getStudents(start,total);
            return students == null||students.size()==0?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(students);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/student")
    DataResponseVO<Integer> postStudent(@RequestBody StudentPO newStudent){
        try {
            return  studentService.postStudent(newStudent) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/student")
    DataResponseVO<Integer> putStudent(@RequestBody StudentPO newStudent){
        try {
            return  studentService.putStudent(newStudent) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @DeleteMapping("/student")
    DataResponseVO<Integer> deleteStudent(@RequestParam("openid") String openid){
        try {
            return  studentService.deleteStudent(openid) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }


}
