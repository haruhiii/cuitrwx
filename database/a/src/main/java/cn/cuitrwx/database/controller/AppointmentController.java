package cn.cuitrwx.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.mapper.AppointmentMapper;
import cn.cuitrwx.database.model.PO.Appointment;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentMapper appointmentMapper;


    @GetMapping("/appointment")
    DataResponse<Appointment> getAppointment(@RequestParam("id") Integer id){
        try {                           
            Appointment appointment = appointmentMapper.getAppointment(id);
            return appointment==null?
                    new DataResponse<>(ErrorCode.EMPTY):new DataResponse<>(appointment);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @GetMapping("/appointments")
    DataResponse<List<Appointment>> getAppointments(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List appointments = appointmentMapper.getAppointments( start, total);
            return appointments == null||appointments.size()==0?
                    new DataResponse<>(ErrorCode.EMPTY):new DataResponse<>(appointments);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    @GetMapping("/myappointments")
    DataResponse<List<Appointment>> getAppointmentsByOpenid(@RequestParam("openid")String openid){       
        try {
        List appointments = appointmentMapper.getAppointmentsByOpenid(openid);
        return appointments == null||appointments.size()==0?
                new DataResponse<>(ErrorCode.EMPTY):new DataResponse<>(appointments);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }

    }

    @PostMapping("/appointment")
    DataResponse<Integer> postAppointment(@RequestBody Appointment newAppointment){
        try {
            return  appointmentMapper.postAppointment(newAppointment) == 0?
                    new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    /**
     * 只有comment，status，ensureTime能改
     * @param newAppointment
     * @return
     */
    @PutMapping("/appointment")
    DataResponse<Integer> putAppointment(@RequestBody Appointment newAppointment){
        try {
            return  appointmentMapper.putAppointment(newAppointment) == 0?
                    new DataResponse<>(ErrorCode.USELESS):new DataResponse<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
   
}
