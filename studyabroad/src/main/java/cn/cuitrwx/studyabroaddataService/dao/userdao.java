package cn.cuitrwx.studyabroaddataService.dao;


import cn.cuitrwx.studyabroaddataService.model.Student;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userdao {
    Student getStudent(String studentid);

    void postStudent(Student student);

    void putStudent(Student student);

    void  deleteStudent(String studentid);
}
