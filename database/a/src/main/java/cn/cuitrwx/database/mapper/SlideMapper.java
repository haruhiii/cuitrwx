package cn.cuitrwx.database.mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

import cn.cuitrwx.database.model.PO.Slide;

import java.util.List;

@Mapper
public interface SlideMapper {

    //获取所有 轮播图
    @Select("select * from cuitrwx.slide  where is_deleted = false")
    List<Slide> getSlides();

    //修改一个 轮播图
    @Update({"<script>",
            "update slide ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='type != null'>type=#{type},</if>",
                "<if test='src != null'>src=#{src},</if>",
                "<if test='articleId != null'>article_id=#{articleId},</if>",
                "<if test='href != null'>href=#{href},</if>",
            "</trim> ",
            "where id = #{id} and is_deleted = false",
            "</script>"})
    Integer putSlide(Slide newSlide);

    //添加一个 轮播图
    @Insert("insert into slide (type, src, article_id,href) values(#{type},#{src},#{articleId},#{href})")
    Integer postSlide(Slide newSlide);

    //删除一个 轮播图
    @Update("update slide  set is_deleted = true where id=#{id} and is_deleted = false")
    Integer deleteSlide(Integer id);

}
