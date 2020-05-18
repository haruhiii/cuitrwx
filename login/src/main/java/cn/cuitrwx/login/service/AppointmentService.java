package cn.cuitrwx.login.service;

import java.util.List;

import cn.cuitrwx.login.model.Appointment;

public interface AppointmentService {

    Integer postAppointment(Appointment newAppointment) throws Exception ;
    
    List<Appointment> getAppointmentsByOpenid(String openid) throws Exception ;
}
