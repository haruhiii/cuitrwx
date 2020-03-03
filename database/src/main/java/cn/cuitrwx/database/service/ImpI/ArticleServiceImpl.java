package cn.cuitrwx.database.service.ImpI;


import cn.cuitrwx.database.dao.ArticleDao;
import cn.cuitrwx.database.model.ArticlePO;
import cn.cuitrwx.database.mybatisutil.mybatisutil;
import cn.cuitrwx.database.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    ArticleDao dao = mybatisutil.getSqlSession().getMapper(ArticleDao.class);

    @Override
    public ArticlePO getArticle(Integer id) {
        return dao.getArticle(id);
    }

    @Override
    public List<ArticlePO> getArticles(Integer start, Integer total) {
        return dao.getArticles(start, total);
    }

    @Override
    public Integer postArticle(ArticlePO newArticle) {
        return dao.postArticle(newArticle);
    }

    @Override
    public Integer putArticle(ArticlePO newArticle) {
        return dao.putArticle(newArticle);
    }

    @Override
    public Integer deleteArticle(Integer id) {
        return dao.deleteArticle(id);
    }

}
