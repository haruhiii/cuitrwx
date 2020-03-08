package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.StudentDao;
import cn.cuitrwx.database.model.StudentPO;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.StudentService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpI implements StudentService {

    StudentDao dao = Mybatisutil.getSqlSession().getMapper(StudentDao.class);

    @Override
    public StudentPO getStudent(String openid) {
        
        return dao.getStudent(openid);
    }

    @Override
    public List<StudentPO> getStudents(Integer start, Integer total) {
        return dao.getStudents(start, total);
    }

    @Override
    public Integer postStudent(StudentPO newStudent) {
        return dao.postStudent(newStudent);
    }

    @Override
    public Integer putStudent(StudentPO newStudent) {
        return dao.putStudent(newStudent);
    }

    @Override
    public Integer deleteStudent(String openid) {
        return dao.deleteStudent(openid);
    }
}
