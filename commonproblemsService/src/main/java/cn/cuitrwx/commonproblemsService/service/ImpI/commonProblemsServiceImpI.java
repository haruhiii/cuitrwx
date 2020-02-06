package cn.cuitrwx.commonproblemsService.service.ImpI;

import cn.cuitrwx.commonproblemsService.dao.userdao;
import cn.cuitrwx.commonproblemsService.model.DataResponseVO;
import cn.cuitrwx.commonproblemsService.model.problem;
import cn.cuitrwx.commonproblemsService.mybatisutil.mybatisutil;
import cn.cuitrwx.commonproblemsService.service.commonProblemsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commonProblemsServiceImpI implements commonProblemsService {
    userdao dao = mybatisutil.getSqlSession().getMapper(userdao.class);

    @Override
    public DataResponseVO<problem> getProblem(String id) {
        return new DataResponseVO<>(dao.getProblem(id));
    }

    @Override
    public DataResponseVO<List<problem>> getAllProblem() {
        return new DataResponseVO<>(dao.getAllProblem());
    }
}
