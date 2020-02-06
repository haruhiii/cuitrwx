package cn.cuitrwx.commonproblemsService.dao;

import cn.cuitrwx.commonproblemsService.model.problem;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userdao {

    problem getProblem(String id);

    List<problem> getAllProblem();

}
