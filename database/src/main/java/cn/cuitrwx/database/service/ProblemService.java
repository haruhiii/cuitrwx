package cn.cuitrwx.database.service;


import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Problem;

import java.util.List;

public interface ProblemService {


    DataResponseVO<Problem> getProblem(String id);

    DataResponseVO<List<Problem>> getAllProblem();
}
