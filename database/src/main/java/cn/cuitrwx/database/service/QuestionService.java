package cn.cuitrwx.database.service;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.QuestionPO;

import java.util.List;

public interface QuestionService {


    List<QuestionPO> getQuestions();
    Integer putQuestion(QuestionPO newQuestion);
    Integer postQuestion(QuestionPO newQuestion);
    Integer deleteQuestion(Integer id);
}
