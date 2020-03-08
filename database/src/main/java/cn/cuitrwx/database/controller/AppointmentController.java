package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.AppointmentPO;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;


    @GetMapping("/appointment")
    DataResponseVO<AppointmentPO> getAppointment(@RequestParam("id") Integer id){
        try {                           
            AppointmentPO appointment = appointmentService.getAppointment(id);
            return appointment==null?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(appointment);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @GetMapping("/appointments")
    DataResponseVO<List<AppointmentPO>> getAppointments(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List appointments = appointmentService.getAppointments( start, total);
            return appointments == null||appointments.size()==0?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(appointments);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/appointment")
    DataResponseVO<Integer> postAppointment(@RequestBody AppointmentPO newAppointment){
        try {
            return  appointmentService.postAppointment(newAppointment) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    /**
     * 只有comment，status，ensureTime能改
     * @param newAppointment
     * @return
     */
    @PutMapping("/appointment")
    DataResponseVO<Integer> putAppointment(@RequestBody AppointmentPO newAppointment){
        try {
            return  appointmentService.putAppointment(newAppointment) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
   
}
