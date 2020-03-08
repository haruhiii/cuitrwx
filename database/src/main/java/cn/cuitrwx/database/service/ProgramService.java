package cn.cuitrwx.database.service;

import cn.cuitrwx.database.model.ProgramPO;


import java.util.List;

public interface ProgramService {
    Integer deleteProgram(Integer id);
    List<ProgramPO> getPrograms();
    Integer putProgram(ProgramPO newProgram);
    Integer postProgram(ProgramPO newProgram);
}
