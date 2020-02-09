package cn.cuitrwx.database.dao;

import cn.cuitrwx.database.model.Program;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProgramUserDao {
    Program getProgram(String overseas_study_id);
    List<Program> getAllProgram();
}
