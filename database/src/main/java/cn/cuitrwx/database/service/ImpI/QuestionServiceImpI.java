package cn.cuitrwx.database.service.ImpI;


import cn.cuitrwx.database.dao.QuestionDao;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.QuestionPO;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.QuestionService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpI implements QuestionService {
    QuestionDao dao = Mybatisutil.getSqlSession().getMapper(QuestionDao.class);

    @Override
    public List<QuestionPO> getQuestions() {
        return dao.getQuestions();
    }
    @Override
    public Integer putQuestion(QuestionPO newQuestion){
        return dao.putQuestion(newQuestion);
    }
    @Override
    public Integer postQuestion(QuestionPO newQuestion){
        return dao.postQuestion(newQuestion);

    }
    @Override
    public Integer deleteQuestion(Integer id){
        return dao.deleteQuestion(id);

    }
}
