package cn.cuitrwx.database.mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

import cn.cuitrwx.database.model.PO.Student;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from cuitrwx.student  where openid=#{openID}  and is_deleted = false")
    Student getStudent(String openID);

    
    @Select("select * from cuitrwx.student where  is_deleted = false order by studentid  asc  limit #{start},#{total}")
    List<Student> getStudents(Integer start,Integer total);

    
    @Insert("insert into cuitrwx.student(openid,session_key) values(#{openid},#{sessionKey})")
    Integer postStudent(Student newStudent);



    
    @Update({"<script>",
            "update student ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='studentid != null'>studentid = #{studentid},</if>",
                "<if test='name != null'>name = #{name},</if>",
                "<if test='className != null'>class_name = #{className},</if>",
                "<if test='grade != null'>grade = #{grade},</if>",
                "<if test='major != null'>major = #{major},</if>",
                "<if test='academy != null'>academy = #{academy},</if>",
                "<if test='avatarUrl != null'>avatar_url = #{avatarUrl},</if>",
                "<if test='province != null'>province = #{province},</if>",
                "<if test='city != null'>city = #{city},</if>",
                "<if test='gender != null'>gender = #{gender},</if>",
                "<if test='nickName != null'>nick_name = #{nickName},</if>",
                "<if test='language != null'>language = #{language},</if>",
                "<if test='country != null'>country = #{country},</if>",
            "</trim> ",
            "where openid = #{openid} and is_deleted = false",
            "</script>"})
    Integer updateStudentBaseInfo(Student newStudent);


    @Update({"<script>",
            "update student ",
            "<trim prefix='set' suffixOverrides=','>",
                "<if test='studentid != null'>studentid = #{studentid},</if>",
                "<if test='name != null'>name = #{name},</if>",
                "<if test='className != null'>class_name = #{className},</if>",
                "<if test='grade != null'>grade = #{grade},</if>",
                "<if test='major != null'>major = #{major},</if>",
                "<if test='compeleted != null'>compeleted = #{compeleted},</if>",
                "<if test='phone != null'>phone = #{phone},</if>",
                "<if test='academy != null'>academy = #{academy},</if>",
                "<if test='avatarUrl != null'>avatar_url = #{avatarUrl},</if>",
                "<if test='nickName != null'>nick_name = #{nickName},</if>",
            "</trim> ",
            "where openid = #{openid} and is_deleted = false",
            "</script>"})
    Integer putStudent(Student newStudent);


    @Update("update cuitrwx.student set is_deleted = true where openid = #{openid} and is_deleted = false")
    Integer deleteStudent(String openID);

}
