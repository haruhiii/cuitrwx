package cn.cuitrwx.database.dao;


import cn.cuitrwx.database.model.Appointment;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AppointmentUserDao {

    Appointment getAppointment(String id);

    List<Appointment> getAllAppointment(String id);

    void postAppointment(Appointment appointment);

    void cancel(String id);


}
