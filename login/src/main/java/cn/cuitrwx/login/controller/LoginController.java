package cn.cuitrwx.login.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    DataResponseVO<StudentPO> getStudentInfo(@RequestParam String code){
        try {
            StudentPO student = loginService.getStudentInfo(code);
            return student == null?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(student);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED,e.getMessage());
        }
    }

}
