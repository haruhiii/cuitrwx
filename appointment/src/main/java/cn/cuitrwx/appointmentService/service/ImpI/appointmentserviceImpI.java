package cn.cuitrwx.appointmentService.service.ImpI;

import cn.cuitrwx.appointmentService.dao.userdao;
import cn.cuitrwx.appointmentService.model.DataResponseVO;
import cn.cuitrwx.appointmentService.model.ErrorCode;
import cn.cuitrwx.appointmentService.model.appointment;
import cn.cuitrwx.appointmentService.mybatisutil.mybatisutil;
import cn.cuitrwx.appointmentService.service.appointmentservice;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class appointmentserviceImpI implements appointmentservice {
    userdao dao = mybatisutil.getSqlSession().getMapper(userdao.class);
    @Override
    public DataResponseVO<appointment> getAppointment(String id) {
        return new DataResponseVO<>(dao.getAppointment(id));
    }

    @Override
    public DataResponseVO<List<appointment>> getAllAppointment(String id) {
        return new DataResponseVO<>(dao.getAllAppointment(id));
    }

    @Override
    public DataResponseVO postAppointment(appointment appointment) {
        dao.postAppointment(appointment);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO cancel(String id) {
        dao.cancel(id);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}
