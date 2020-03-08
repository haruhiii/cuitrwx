package cn.cuitrwx.database.dao;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import cn.cuitrwx.database.model.ProgramPO;

import java.util.List;

@Mapper
@Repository
public interface ProgramDao {
    Integer deleteProgram(Integer id);
    List<ProgramPO> getPrograms();
    Integer putProgram(ProgramPO newProgram);
    Integer postProgram(ProgramPO newProgram);
}
