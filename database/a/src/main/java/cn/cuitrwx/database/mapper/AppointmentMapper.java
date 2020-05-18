package cn.cuitrwx.database.mapper;


import cn.cuitrwx.database.model.PO.Appointment;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AppointmentMapper {

    //通过预约编号 获取某个预约信息
    @Select("select * from appointment where id = #{id}")
    Appointment getAppointment(Integer id);

    //获取所有预约信息
    @Select("select * from appointment  order by id  desc  limit #{start},#{total}")
    List<Appointment> getAppointments(Integer start,Integer total);

    //通过用户编号 获取预约信息
    @Select("select * from appointment where openid = #{openid}")
    List<Appointment> getAppointmentsByOpenid(String openid);
    
    //新建预约
    @Insert("insert into appointment(openid, matter,request_date) values (#{openid},#{matter},#{requestDate})")
    Integer postAppointment(Appointment newAppointment);
    
    //修改预约
    @Update({"<script>",
    "update appointment ",
     "<trim prefix='set' suffixOverrides=','>",
        "<if test='comment != null'>comment=#{comment},</if>",
        "<if test='status != null'>status=#{status},</if>",
        "<if test='ensureTime != null'>ensure_time=#{ensureTime},</if>",
    "</trim> ",
    "where id = #{id} and is_deleted = false",
    "</script>"})
    Integer putAppointment(Appointment newAppointment);

}