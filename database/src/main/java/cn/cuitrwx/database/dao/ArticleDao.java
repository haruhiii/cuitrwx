package cn.cuitrwx.database.dao;

import cn.cuitrwx.database.model.ArticlePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleDao {
    ArticlePO getArticle(Integer id);

    List<ArticlePO> getArticles(Integer start,Integer total);

    Integer postArticle(ArticlePO newArticle);

    Integer putArticle(ArticlePO newArticle);

    Integer deleteArticle(Integer id);

}
