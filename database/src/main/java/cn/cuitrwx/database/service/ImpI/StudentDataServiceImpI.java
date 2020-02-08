package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.StudentDataUserDao;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.Studentdata;
import cn.cuitrwx.database.mybatisutil.mybatisutil;
import cn.cuitrwx.database.service.StudentDataService;

import org.springframework.stereotype.Service;

@Service
public class StudentDataServiceImpI implements StudentDataService {

    StudentDataUserDao dao = mybatisutil.getSqlSession().getMapper(StudentDataUserDao.class);

    @Override
    public DataResponseVO<Studentdata> getStudentData(String id) {
        return new DataResponseVO<>(dao.getStudentData(id));
    }

    @Override
    public DataResponseVO postStudentData(Studentdata studentdata) {
        dao.postStudentData(studentdata);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO putStudentData(Studentdata studentdata) {
        dao.putsStudentData(studentdata);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO deleteStudentData(String id) {
        dao.deleteStudentData(id);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}
