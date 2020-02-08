package cn.cuitrwx.database.controller;


import cn.cuitrwx.database.model.Appointment;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentservice;

    @GetMapping("/Appointment")
    DataResponseVO<Appointment> getAppointment(String id) {
        return appointmentservice.getAppointment(id);
    }

    @GetMapping("/allappointment")
    DataResponseVO<List<Appointment>> getAllAppointment(String id) {
        return appointmentservice.getAllAppointment(id);
    }

    @PostMapping("/postappointment")
    DataResponseVO PostStudent(Appointment appointment) {

        return appointmentservice.postAppointment(appointment);
    }

    @PutMapping("/cancel")
    DataResponseVO cancel(String id) {

        return appointmentservice.cancel(id);
    }

}
