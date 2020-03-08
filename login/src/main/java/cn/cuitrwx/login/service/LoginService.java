package cn.cuitrwx.login.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import cn.cuitrwx.login.model.StudentPO;



public interface LoginService {

    public StudentPO getStudentInfo(String code) throws Exception;
}
