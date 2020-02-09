package cn.cuitrwx.database.service;



import cn.cuitrwx.database.model.Article;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.UpdateArticle;

import java.util.List;


public interface ArticleService {

    DataResponseVO<Article> getArticle(String articleid);

    DataResponseVO<List<Article>> getAllArticle();

    DataResponseVO postArticle(Article article);

    DataResponseVO putArticle(UpdateArticle updatearticle);

    DataResponseVO deleteArticle(String articleid);

}
