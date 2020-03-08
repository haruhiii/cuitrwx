package cn.cuitrwx.database.service;

import java.util.List;

import cn.cuitrwx.database.model.StudentPO;


public interface StudentService {
    
    StudentPO getStudent(String openID);

    List<StudentPO> getStudents(Integer start,Integer total);

    Integer postStudent(StudentPO newStudent);

    Integer putStudent(StudentPO newStudent);

    Integer deleteStudent(String openid);

}
