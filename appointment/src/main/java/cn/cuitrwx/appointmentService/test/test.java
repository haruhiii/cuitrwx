package cn.cuitrwx.appointmentService.test;

import cn.cuitrwx.appointmentService.model.DataResponseVO;
import cn.cuitrwx.appointmentService.model.appointment;
import cn.cuitrwx.appointmentService.service.appointmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {
    @Autowired
    private appointmentservice appointmentservice;

    @GetMapping("/appointment")
    DataResponseVO<appointment> getAppointment(String id) {
        return appointmentservice.getAppointment(id);
    }

    @GetMapping("/allappointment")
    DataResponseVO<List<appointment>> getAllAppointment(String id) {
        return appointmentservice.getAllAppointment(id);
    }

    @PostMapping("/postappointment")
    DataResponseVO PostStudent(appointment appointment) {

        return appointmentservice.postAppointment(appointment);
    }

    @PutMapping("/cancel")
    DataResponseVO cancel(String id) {

        return appointmentservice.cancel(id);
    }

}
