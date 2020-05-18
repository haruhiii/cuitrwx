package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.mapper.StudentMapper;
import cn.cuitrwx.database.model.PO.Student;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    
    @GetMapping("/student")
    DataResponse<Student> getStudent(@RequestParam("openid") String openid){
        try {
            Student student = studentMapper.getStudent(openid);
            return student==null?
                    new DataResponse<>(ErrorCode.EMPTY):new DataResponse<>(student);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @GetMapping("/students")
    DataResponse<List<Student>> getStudents(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List students = studentMapper.getStudents(start,total);
            return students == null||students.size()==0?
                    new DataResponse<>(ErrorCode.EMPTY):new DataResponse<>(students);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/student")
    DataResponse<Integer> postStudent(@RequestBody Student newStudent){

        try {
            return  studentMapper.postStudent(newStudent) == 0?
                    new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/student")
    DataResponse<Integer> putStudent(@RequestBody Student newStudent){
        if(newStudent.getPhone()!=null && newStudent.getPhone()!=""){
            newStudent.setCompeleted(true);
        }
        try {
            return  studentMapper.putStudent(newStudent) == 0?
                    new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    @DeleteMapping("/student")
    DataResponse<Integer> deleteStudent(@RequestParam("openid") String openid){
        
        try {
            return  studentMapper.deleteStudent(openid) == 0?
                    new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    @PutMapping("/studentbase")
    public DataResponse<Integer>  updateStudentBaseInfo(@RequestBody  Student newStudent){
        System.out.println("------------------------");
        System.out.println(newStudent.getOpenid());
        System.out.println("------------------------");
        System.out.println(newStudent.getAvatarUrl());

        try {
            return  studentMapper.updateStudentBaseInfo(newStudent) == 0?
                new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }


}
