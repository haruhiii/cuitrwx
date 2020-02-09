package cn.cuitrwx.database.dao;


import cn.cuitrwx.database.model.Problem;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProblemUserDao {

    Problem getProblem(String id);

    List<Problem> getAllProblem();

}
