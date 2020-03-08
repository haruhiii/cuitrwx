package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.AppointmentDao;
import cn.cuitrwx.database.model.AppointmentPO;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpI implements AppointmentService {
    AppointmentDao dao = Mybatisutil.getSqlSession().getMapper(AppointmentDao.class);

    @Override
    public AppointmentPO getAppointment(Integer id) {
        return dao.getAppointment(id);
    }

    @Override
    public List<AppointmentPO> getAppointments(Integer start,Integer total) {
        return dao.getAppointments(start,total);
    }

    @Override
    public Integer postAppointment(AppointmentPO newAppointment) {
        return dao.postAppointment(newAppointment);
    }

    @Override
    public Integer putAppointment(AppointmentPO newAppointment) {
        return dao.putAppointment(newAppointment);
    }
}
