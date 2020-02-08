package cn.cuitrwx.database.dao;


import cn.cuitrwx.database.model.StudyAbroad;
;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudyAbroadUserDao {
    StudyAbroad getStudent(String studentid);

    void postStudent(StudyAbroad studyabroad);

    void putStudent(StudyAbroad studyabroad);

    void  deleteStudent(String studentid);
}
