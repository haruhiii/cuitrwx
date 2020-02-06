package cn.cuitrwx.studyabroaddataService.service;

import cn.cuitrwx.studyabroaddataService.model.DataResponseVO;
import cn.cuitrwx.studyabroaddataService.model.Student;

public interface StudybroadService {
    DataResponseVO<Student> getStudent(String studentid);

    DataResponseVO postStudent(Student student);

    DataResponseVO putStudent(Student student);

    DataResponseVO deleteStudent(String studentid);
}
