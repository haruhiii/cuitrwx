package cn.cuitrwx.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.login.model.DataResponseVO;
import cn.cuitrwx.login.model.ErrorCode;
import cn.cuitrwx.login.model.StudentPO;
import cn.cuitrwx.login.service.LoginService;


@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    DataResponseVO<StudentPO> getStudentInfo(@RequestParam final String code){
        try {
            final StudentPO student = loginService.getStudentInfo(code);
            return student == null?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(student);
        } catch (final Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED,e.getMessage());
        }
    }
    @PutMapping("/update")
    DataResponseVO<Integer> updateStudentBaseInfo(@RequestBody final StudentPO newStudent){
        System.out.println("------------------------");
        System.out.println(newStudent.getOpenid());
        System.out.println("------------------------");
        try {
            return loginService.updateStudentBaseInfo(newStudent) == 1?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (final Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED,e.getMessage());
        }
    }
    @PutMapping("/student")
    DataResponseVO<Integer> putStudent(@RequestBody final StudentPO newStudent){
        System.out.println("------------------------");
        System.out.println(newStudent.getOpenid());
        System.out.println("------------------------");
        try {
            return loginService.putStudent(newStudent) == 1?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (final Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED,e.getMessage());
        }
    }

    
}
