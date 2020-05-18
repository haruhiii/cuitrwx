package cn.cuitrwx.login.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cn.cuitrwx.login.feign.IDatabaseFeign;
import cn.cuitrwx.login.model.Appointment;
import cn.cuitrwx.login.model.ConfigPO;
import cn.cuitrwx.login.model.DataResponseVO;
import cn.cuitrwx.login.model.ErrorCode;
import cn.cuitrwx.login.model.StudentPO;
import cn.cuitrwx.login.service.AppointmentService;
import cn.cuitrwx.login.service.LoginService;
import springfox.documentation.spring.web.json.Json;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private IDatabaseFeign databaseFeign;

    @Override
    public Integer postAppointment(Appointment newAppointment) throws Exception {
        DataResponseVO<Integer> res = databaseFeign.postAppointment(newAppointment);
        switch (res.getErrCode()) {
            case SUCCESS:
                return res.getData();
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        return 0;
    }

    @Override
    public List<Appointment> getAppointmentsByOpenid(String openid) throws Exception {

        DataResponseVO< List<Appointment>> res = databaseFeign.getAppointmentsByOpenid(openid);
        switch (res.getErrCode()) {
            case SUCCESS:
                return res.getData();
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        return null;        
    }
}
