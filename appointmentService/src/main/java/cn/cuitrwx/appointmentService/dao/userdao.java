package cn.cuitrwx.appointmentService.dao;

import cn.cuitrwx.appointmentService.model.appointment;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userdao {

    appointment getAppointment(String id);

    List<appointment> getAllAppointment(String id);

    void postAppointment(appointment appointment);

    void cancel(String id);


}
