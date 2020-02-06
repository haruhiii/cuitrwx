package cn.cuitrwx.articledataService.service;


import cn.cuitrwx.articledataService.model.Article;
import cn.cuitrwx.articledataService.model.DataResponseVO;
import cn.cuitrwx.articledataService.model.UpdateArticle;

import java.util.List;


public interface ArticleDataService {

    DataResponseVO<Article> getArticle(String articleid);

    DataResponseVO<List<Article>> getAllArticle();

    DataResponseVO postArticle(Article article);

    DataResponseVO putArticle(UpdateArticle updatearticle);

    DataResponseVO deleteArticle(String articleid);

}
