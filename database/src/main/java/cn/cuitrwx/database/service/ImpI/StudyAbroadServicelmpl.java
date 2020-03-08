package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.StudyAbroadUserDao;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.StudyAbroad;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.StudyAbroadService;

import org.springframework.stereotype.Service;

@Service
public class StudyAbroadServicelmpl implements StudyAbroadService {

    StudyAbroadUserDao dao = Mybatisutil.getSqlSession().getMapper(StudyAbroadUserDao.class);

    @Override
    public DataResponseVO<StudyAbroad> getStudent(String studentid) {
        return new DataResponseVO<>(dao.getStudent(studentid));
    }

    @Override
    public DataResponseVO postStudent(StudyAbroad studyabroad) {
        dao.postStudent(studyabroad);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO putStudent(StudyAbroad studyabroad) {
        dao.putStudent(studyabroad);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO deleteStudent(String studentid) {
        dao.deleteStudent(studentid);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}


