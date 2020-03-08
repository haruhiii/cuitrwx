package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.ProgramDao;
import cn.cuitrwx.database.model.ProgramPO;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.ProgramService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramServiceImpI implements ProgramService {
    ProgramDao dao = Mybatisutil.getSqlSession().getMapper(ProgramDao.class);

    @Override
    public Integer deleteProgram(Integer id) {
        return dao.deleteProgram(id);
    }

    @Override
    public List<ProgramPO> getPrograms() {
        return dao.getPrograms();
    }

    @Override
    public Integer putProgram(ProgramPO newProgram) {
        return dao.putProgram(newProgram);
    }

    @Override
    public Integer postProgram(ProgramPO newProgram) {
        return dao.postProgram(newProgram);
    }

}
