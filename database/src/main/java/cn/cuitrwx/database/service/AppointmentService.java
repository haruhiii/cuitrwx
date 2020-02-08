package cn.cuitrwx.database.service;


import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Appointment;

import java.util.List;

public interface AppointmentService {

    DataResponseVO<Appointment> getAppointment(String id);

    DataResponseVO<List<Appointment>> getAllAppointment(String id);

    DataResponseVO postAppointment(Appointment appointment);

    DataResponseVO cancel(String id);
}
