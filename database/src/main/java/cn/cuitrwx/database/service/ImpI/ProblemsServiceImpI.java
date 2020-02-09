package cn.cuitrwx.database.service.ImpI;


import cn.cuitrwx.database.dao.ProblemUserDao;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Problem;
import cn.cuitrwx.database.mybatisutil.mybatisutil;
import cn.cuitrwx.database.service.ProblemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemsServiceImpI implements ProblemService {
    ProblemUserDao dao = mybatisutil.getSqlSession().getMapper(ProblemUserDao.class);

    @Override
    public DataResponseVO<Problem> getProblem(String id) {
        return new DataResponseVO<>(dao.getProblem(id));
    }

    @Override
    public DataResponseVO<List<Problem>> getAllProblem() {
        return new DataResponseVO<>(dao.getAllProblem());
    }
}
