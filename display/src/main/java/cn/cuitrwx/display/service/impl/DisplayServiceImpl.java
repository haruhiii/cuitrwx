package cn.cuitrwx.display.service.impl;

import cn.cuitrwx.display.feign.IDatabaseFeign;
import cn.cuitrwx.display.model.DataResponseVO;
import cn.cuitrwx.display.model.Program;
import cn.cuitrwx.display.model.QuestionPO;
import cn.cuitrwx.display.model.ArticlePO;
import cn.cuitrwx.display.model.SlidePO;
import cn.cuitrwx.display.service.DisplayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    @Override
    public  List<Program> getPrograms()  throws Exception{
        DataResponseVO<List<Program>>  programData = databaseFeign.getPrograms();
        List<Program> programs = null;
        switch (programData.getErrCode()) {
            case SUCCESS:
                programs = programData.getData();
                break;
            case FAILED:
                throw new Exception("数据库错误");
            case EMPTY:
                return null;
            default:
                break;
        }
        return programs; 
    }


}
