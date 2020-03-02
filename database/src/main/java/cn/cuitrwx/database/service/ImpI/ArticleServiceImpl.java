package cn.cuitrwx.database.service.ImpI;


import cn.cuitrwx.database.dao.ArticleDao;
import cn.cuitrwx.database.model.Article;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.UpdateArticle;
import cn.cuitrwx.database.mybatisutil.mybatisutil;
import cn.cuitrwx.database.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {


    ArticleDao dao = mybatisutil.getSqlSession().getMapper(ArticleDao.class);

    @Override
    public DataResponseVO<List<Article>> getAllArticle() {
        return new DataResponseVO<>(dao.getAllArticle());
    }

    @Override
    public DataResponseVO<Article> getArticle(String articleid) {
        return new DataResponseVO<>(dao.getArticle(articleid));
    }

    @Override
    public DataResponseVO postArticle(Article article) {
        dao.postArticle(article);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO putArticle(UpdateArticle updateArticle) {
        dao.putArticle(updateArticle);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO deleteArticle(String articleid) {
        dao.deleteArticle(articleid);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}
