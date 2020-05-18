package cn.cuitrwx.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.login.model.Appointment;
import cn.cuitrwx.login.model.DataResponseVO;
import cn.cuitrwx.login.model.ErrorCode;
import cn.cuitrwx.login.service.AppointmentService;
@RestController

public class AppointmentController {
    
    @Autowired
    private AppointmentService appointmentService;
    
    @PostMapping("/appointment")
    DataResponseVO<Integer> postAppointment(@RequestBody Appointment newAppointment){
        try {
            return  appointmentService.postAppointment(newAppointment) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @GetMapping("/myappointments")
    DataResponseVO<List<Appointment>> getAppointmentsByOpenid(@RequestParam("openid")String openid){       
        try {
        List appointments = appointmentService.getAppointmentsByOpenid(openid);
        return appointments == null||appointments.size()==0?
                new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(appointments);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }

    }
}