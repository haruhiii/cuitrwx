package cn.cuitrwx.display.service.impl;

import cn.cuitrwx.display.feign.IDatabaseFeign;
import cn.cuitrwx.display.model.DataResponseVO;
import cn.cuitrwx.display.model.ErrorCode;
import cn.cuitrwx.display.model.NoticePO;
import cn.cuitrwx.display.model.QuestionPO;
import cn.cuitrwx.display.model.ArticlePO;
import cn.cuitrwx.display.model.QuestionsPO;
import cn.cuitrwx.display.model.SlideDataPO;
import cn.cuitrwx.display.model.SlidePO;
import cn.cuitrwx.display.service.DisplayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    private IDatabaseFeign databaseFeign;

    @Override
    public List getSlide() throws Exception{
        DataResponseVO<List<SlidePO>>  slidesData = databaseFeign.getSlides();
        List<SlidePO> slides = null;
        switch (slidesData.getErrCode()) {
            case SUCCESS:
                slides = slidesData.getData();
                break;
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        return slides;
    }

    @Override
    public ArticlePO getArticle(Integer id) throws Exception {
        DataResponseVO<ArticlePO>  articleData = databaseFeign.getArticle(id);
        ArticlePO article = null;
        switch (articleData.getErrCode()) {
            case SUCCESS:
                article = articleData.getData();
                break;
            case FAILED:
                throw new Exception("数据库错误");
            case EMPTY:
                return null;
            default:
                break;
        }
        return article;
    }

    @Override
    public List<ArticlePO> getArticles(Integer start, Integer total) throws Exception {

        DataResponseVO<List<ArticlePO>>  articlesData = databaseFeign.getArticles(start,total);
        List<ArticlePO> articles = null;
        switch (articlesData.getErrCode()) {
            case SUCCESS:
                articles = articlesData.getData();
                break;
            case FAILED:
                throw new Exception("数据库错误");
            case EMPTY:
                return null;
            default:
                break;
        }
        return articles; 
    }

    @Override
    public  List<QuestionPO> getQuestions()  throws Exception{
        DataResponseVO<List<QuestionPO>>  questionsData = databaseFeign.getQuestions();
        List<QuestionPO> questions = null;
        switch (questionsData.getErrCode()) {
            case SUCCESS:
                questions = questionsData.getData();
                break;
            case FAILED:
                throw new Exception("数据库错误");
            case EMPTY:
                return null;
            default:
                break;
        }
        return questions; 
    }

    // @Override
    // public ArticalPO getPostContent(final String id) {
    //     final ArticalPO post = new ArticalPO(1, "post");
    //     return post;
    // }

    // @Override
    // public List getQuestions() {
    //     final List questions = new ArrayList<>();
    //     questions.add(new QuestionsPO("question1", "question1", "question1"));
    //     questions.add(new QuestionsPO("question2", "question2", "question2"));
    //     return questions;
    // }

    // @Override
    // public NoticePO getNotice() {
    //     final NoticePO notice = new NoticePO("通知内容，内容内容内容，内容内容内容内容", "");
    //     return notice;       
    // }
}
