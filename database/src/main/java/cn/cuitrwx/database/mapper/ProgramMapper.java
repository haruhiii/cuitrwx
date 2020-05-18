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

    @Update({"<script>",
           "update question ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='name != null'>name=#{name},</if>",
                "<if test='summary != null'>summary=#{summary},</if>",
                "<if test='target != null'>target=#{target},</if>",
                "<if test='score != null'>score=#{score},</if>",
                "<if test='time != null'>time=#{time},</if>",
                "<if test='url != null'>url=#{url},</if>",
                "<if test='file != null'>file=#{file},</if>",
           "</trim> ",
           "where id = #{id} and is_deleted = false",
           "</script>"})    
    Integer putProgram(Program newProgram);

    //添加一个项目
    @Insert(" insert into cuitrwx.program(name, summary, target,score,time,url,file) values(#{name}, #{summary}, #{target},#{score},#{time},#{url},#{file})")
    Integer postProgram(Program newProgram);

    //删除一个 项目
    @Update("update program set is_deleted = true where id=#{id} and is_deleted = false")
    Integer deleteProgram(Integer id);
}