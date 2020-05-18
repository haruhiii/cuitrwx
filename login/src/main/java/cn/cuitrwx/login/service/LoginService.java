package cn.cuitrwx.login.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import cn.cuitrwx.login.model.StudentPO;



public interface LoginService {

   StudentPO getStudentInfo(String code) throws Exception;
   Integer updateStudentBaseInfo(StudentPO newStudent) throws Exception;
   Integer putStudent(StudentPO newStudent) throws Exception ;

}
