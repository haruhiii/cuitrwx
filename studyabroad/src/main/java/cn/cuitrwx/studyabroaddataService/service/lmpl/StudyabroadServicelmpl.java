package cn.cuitrwx.studyabroaddataService.service.lmpl;

import cn.cuitrwx.studyabroaddataService.dao.userdao;
import cn.cuitrwx.studyabroaddataService.model.DataResponseVO;
import cn.cuitrwx.studyabroaddataService.model.ErrorCode;
import cn.cuitrwx.studyabroaddataService.model.Student;
import cn.cuitrwx.studyabroaddataService.mybatisutil.MybatisUtils;
import cn.cuitrwx.studyabroaddataService.service.StudybroadService;
import org.springframework.stereotype.Service;

@Service
public class StudyabroadServicelmpl implements StudybroadService {

    userdao dao = MybatisUtils.getSqlSession().getMapper(userdao.class);

    @Override
    public DataResponseVO<Student> getStudent(String studentid) {
        return new DataResponseVO<>(dao.getStudent(studentid));
    }

    @Override
    public DataResponseVO postStudent(Student student) {
        dao.postStudent(student);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO putStudent(Student student) {
        dao.putStudent(student);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }

    @Override
    public DataResponseVO deleteStudent(String studentid) {
        dao.deleteStudent(studentid);
        return new DataResponseVO<>(ErrorCode.FAILED, "testFailed");
    }
}


