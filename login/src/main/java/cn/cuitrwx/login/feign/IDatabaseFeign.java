package cn.cuitrwx.login.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import cn.cuitrwx.login.model.Appointment;
import cn.cuitrwx.login.model.DataResponseVO;
import cn.cuitrwx.login.model.StudentPO;


@FeignClient(name = "database")
public interface IDatabaseFeign {
    // @GetMapping("/configs")
    // DataResponseVO<List<ConfigPO>> getConfigs();

    @GetMapping("/student")
    DataResponseVO<StudentPO> getStudent(@RequestParam("openid") String openid);

    @PostMapping("/student")
    DataResponseVO<Integer> postStudent(@RequestBody StudentPO newStudent);

    @PutMapping("/student")
    DataResponseVO<Integer> putStudent(@RequestBody StudentPO newStudent);

    @PutMapping("/studentbase")
    DataResponseVO<Integer> updateStudentBaseInfo(@RequestBody StudentPO newStudent);
    
    @PostMapping("/appointment")
    DataResponseVO<Integer> postAppointment(Appointment newAppointment);
    
    @GetMapping("/myappointments")
    DataResponseVO<List<Appointment>> getAppointmentsByOpenid(@RequestParam("openid") String openid);


}   