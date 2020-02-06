package cn.cuitrwx.articledataService.dao;

import cn.cuitrwx.articledataService.model.Article;
import cn.cuitrwx.articledataService.model.DataResponseVO;
import cn.cuitrwx.articledataService.model.UpdateArticle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserDao {
    Article getArticle(String articleid);

    List<Article> getAllArticle();

    void postArticle(Article article);

    void putArticle(UpdateArticle updatearticle);

   void  deleteArticle(String articleid);

}
