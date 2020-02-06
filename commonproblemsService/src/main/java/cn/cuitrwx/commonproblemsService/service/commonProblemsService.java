package cn.cuitrwx.commonproblemsService.service;

import cn.cuitrwx.commonproblemsService.model.DataResponseVO;
import cn.cuitrwx.commonproblemsService.model.problem;

import java.util.List;

public interface commonProblemsService {


    DataResponseVO<problem> getProblem(String id);

    DataResponseVO<List<problem>> getAllProblem();
}
