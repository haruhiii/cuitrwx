package cn.cuitrwx.database.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.cuitrwx.database.model.PO.Program;

import java.util.List;

@Mapper
public interface ProgramMapper {

    //获取所有 项目信息
    @Select("select * from cuitrwx.program  where is_deleted = false")
    List<Program> getPrograms();

    //修改一个项目
    @Update({"<script>",
           "update question ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='title != null'>title=#{title},</if>",
                "<if test='description != null'>description=#{description},</if>",
                "<if test='detail != null'>detail=#{detail},</if>",
                "<if test='score != null'>score=#{score},</if>",
                "<if test='time != null'>time=#{time},</if>",
                "<if test='requirement != null'>requirement=#{requirement},</if>",
           "</trim> ",
           "where id = #{id} and is_deleted = false",
           "</script>"})    
    Integer putProgram(Program newProgram);

    //添加一个项目
    @Insert(" insert into cuitrwx.program(title, description, detail,score,time,requirement) values(#{title}, #{description}, #{detail},#{score},#{time},#{requirement})")
    Integer postProgram(Program newProgram);

    //删除一个 项目
    @Update("update program set is_deleted = true where id=#{id} and is_deleted = false")
    Integer deleteProgram(Integer id);
}