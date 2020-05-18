package cn.cuitrwx.database.mapper;

import cn.cuitrwx.database.model.PO.Question;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionMapper {

    //查询所有的 问题
    @Select("select id,question,answer from question where  is_deleted = false order by id  desc")
    List<Question> getQuestions();

    //更改一个 问题
    @Update({"<script>",
           "update question ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='question != null'>question=#{question},</if>",
                "<if test='answer != null'>answer=#{answer},</if>",
           "</trim> ",
           "where id = #{id} and is_deleted = false",
           "</script>"})
    Integer putQuestion(Question newQuestion);  

    //增加一个 问题    
    @Insert("insert into question(question,answer) values (#{question},#{answer})")
    Integer postQuestion(Question newQuestion);

    //删除一个 问题    
    @Update("update question set is_deleted = true  where id=#{id}")
    Integer deleteQuestion(Integer id);
    
}
