package cn.cuitrwx.database.service;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.AppointmentPO;

import java.util.List;

public interface AppointmentService {

    AppointmentPO getAppointment(Integer id);

    List<AppointmentPO> getAppointments(Integer start,Integer total);

    Integer postAppointment(AppointmentPO newAppointment);
    
    Integer putAppointment(AppointmentPO newAppointment);
}
