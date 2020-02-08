package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.ProgramUserDao;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Program;
import cn.cuitrwx.database.mybatisutil.mybatisutil;
import cn.cuitrwx.database.service.StudyAbroadProgramService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyAbroadProgramServiceImpI implements StudyAbroadProgramService {
    ProgramUserDao dao = mybatisutil.getSqlSession().getMapper(ProgramUserDao.class);

    @Override
    public DataResponseVO<List<Program>> getAllProgram() {
        return new DataResponseVO<>(dao.getAllProgram());
    }

    @Override
    public DataResponseVO<Program> getProgram(String overseas_study_id) {
        return new DataResponseVO<>(dao.getProgram(overseas_study_id));
    }
}
