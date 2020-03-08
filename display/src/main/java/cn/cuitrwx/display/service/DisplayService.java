package cn.cuitrwx.display.service;

import cn.cuitrwx.display.model.ArticlePO;
import cn.cuitrwx.display.model.QuestionPO;
import cn.cuitrwx.display.model.SlidePO;

import java.util.List;

public interface DisplayService {
    List<SlidePO> getSlide() throws Exception;

    ArticlePO getArticle(Integer id) throws Exception;

    List<ArticlePO> getArticles(Integer start,Integer total)  throws Exception;

    List<QuestionPO>  getQuestions()  throws Exception;

    
    // List getPost(Integer start, Integer end);
    // ArticlePO getPostContent(String id);
    // NoticePO getNotice();
    // List getQuestions();
}
