package cn.cuitrwx.articledataService.service.servicelmpl;

import cn.cuitrwx.articledataService.dao.UserDao;
import cn.cuitrwx.articledataService.model.Article;
import cn.cuitrwx.articledataService.model.DataResponseVO;
import cn.cuitrwx.articledataService.model.ErrorCode;
import cn.cuitrwx.articledataService.model.UpdateArticle;
import cn.cuitrwx.articledataService.service.ArticleDataService;
import cn.cuitrwx.articledataService.util.MybatisUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleDataServiceImpl implements ArticleDataService {


    UserDao dao = MybatisUtils.getSqlSession().getMapper(UserDao.class);

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
