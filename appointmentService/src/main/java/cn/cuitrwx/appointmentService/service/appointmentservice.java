package cn.cuitrwx.appointmentService.service;

import cn.cuitrwx.appointmentService.model.DataResponseVO;
import cn.cuitrwx.appointmentService.model.appointment;

import java.util.List;

public interface appointmentservice {

    DataResponseVO<appointment> getAppointment(String id);

    DataResponseVO<List<appointment>> getAllAppointment(String id);

    DataResponseVO postAppointment(appointment appointment);

    DataResponseVO cancel(String id);
}
