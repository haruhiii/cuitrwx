package cn.cuitrwx.database.dao;


import cn.cuitrwx.database.model.Article;
import cn.cuitrwx.database.model.UpdateArticle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ArticleUserDao {
    Article getArticle(String articleid);

    List<Article> getAllArticle();

    void postArticle(Article article);

    void putArticle(UpdateArticle updatearticle);

   void  deleteArticle(String articleid);

}
