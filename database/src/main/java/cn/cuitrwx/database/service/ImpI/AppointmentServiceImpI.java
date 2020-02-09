package cn.cuitrwx.database.service.ImpI;


import cn.cuitrwx.database.dao.AppointmentUserDao;
import cn.cuitrwx.database.model.Appointment;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.mybatisutil.mybatisutil;
import cn.cuitrwx.database.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentServiceImpI implements AppointmentService {
    AppointmentUserDao dao = mybatisutil.getSqlSession().getMapper(AppointmentUserDao.class);
    @Override
    public DataResponseVO<Appointment> getAppointment(String id) {
        return new DataResponseVO<>(dao.getAppointment(id));
    }

    @Override
    public DataResponseVO<List<Appointment>> getAllAppointment(String id) {
        return new DataResponseVO<>(dao.getAllAppointment(id));
    }

    @Override
    public DataResponseVO postAppointment(Appointment appointment) {
        dao.postAppointment(appointment);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO cancel(String id) {
        dao.cancel(id);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}
