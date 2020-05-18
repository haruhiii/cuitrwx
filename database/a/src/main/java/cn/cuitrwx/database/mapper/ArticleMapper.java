package cn.cuitrwx.database.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import cn.cuitrwx.database.model.PO.Article;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {

    //查询一篇 文章
    @Select("select * from article where id = #{id} and is_deleted = false")
    Article getArticle(Integer id);

    //查询所有的 文章 基本信息 (不含正文)
    @Select("select id,title,outline from article where  is_deleted = false order by id  desc limit #{start},#{total}")
    List<Article> getArticles(Integer start,Integer total);

    //增加一篇 文章    
    @Insert("insert into article(title, outline, content) values(#{title}, #{outline}, #{content})") 
    Integer postArticle(Article newArticle);

    //更改一篇 文章
    @Update({"<script>",
           "update article ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='title != null'>title=#{title},</if>",
                "<if test='outline != null'>outline=#{outline},</if>",
                "<if test='content != null'>content=#{content},</if>",
           "</trim> ",
           "where id = #{id} and is_deleted = false",
           "</script>"})
    Integer putArticle(Article newArticle);

    //删除一篇 文章
    @Update("update article set is_deleted = true  where id=#{id}")
    Integer deleteArticle(Integer id);

}
