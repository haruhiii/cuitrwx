package cn.cuitrwx.database.dao;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import cn.cuitrwx.database.model.StudentPO;

@Mapper
@Repository
public interface StudentDao {
    StudentPO getStudent(String openID);

    List<StudentPO> getStudents(Integer start,Integer total);

    Integer postStudent(StudentPO newStudent);

    Integer putStudent(StudentPO newStudent);

    Integer deleteStudent(String openID);
    
}
