package cn.cuitrwx.database.dao;

import cn.cuitrwx.database.model.Studentdata;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentDataUserDao {
    Studentdata getStudentData(String id);

    void postStudentData(Studentdata data);

    void putsStudentData(Studentdata data);

    void deleteStudentData(String id);
}
