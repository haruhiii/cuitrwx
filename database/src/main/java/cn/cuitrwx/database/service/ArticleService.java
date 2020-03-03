package cn.cuitrwx.database.service;



import cn.cuitrwx.database.model.ArticlePO;
import cn.cuitrwx.database.model.DataResponseVO;
import java.util.List;


public interface ArticleService {

    ArticlePO getArticle(Integer id);

    List<ArticlePO> getArticles(Integer start,Integer total);

    Integer postArticle(ArticlePO newArticle);

    Integer putArticle(ArticlePO newArticle);

    Integer deleteArticle(Integer id);
    

}
