package cn.cuitrwx.database.service;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Program;


import java.util.List;

public interface StudyAbroadProgramService {
    DataResponseVO<Program> getProgram(String overseas_study_id);
    DataResponseVO<List<Program>> getAllProgram();
}
