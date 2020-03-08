package cn.cuitrwx.database.dao;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import cn.cuitrwx.database.model.AppointmentPO;

import java.util.List;

@Mapper
@Repository
public interface AppointmentDao {

    AppointmentPO getAppointment(Integer id);

    List<AppointmentPO> getAppointments(Integer start,Integer total);

    Integer postAppointment(AppointmentPO newAppointment);
    
    Integer putAppointment(AppointmentPO newAppointment);

}
