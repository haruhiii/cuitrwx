package cn.cuitrwx.database.dao;


import cn.cuitrwx.database.model.QuestionPO;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QuestionDao {

    List<QuestionPO> getQuestions();
    Integer putQuestion(QuestionPO newQuestion);
    Integer postQuestion(QuestionPO newQuestion);
    Integer deleteQuestion(Integer id);
    
}
