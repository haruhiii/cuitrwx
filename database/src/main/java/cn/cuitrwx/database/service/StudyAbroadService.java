package cn.cuitrwx.database.service;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.StudyAbroad;


public interface StudyAbroadService {
    DataResponseVO<StudyAbroad> getStudent(String studentid);

    DataResponseVO postStudent(StudyAbroad studyabroad);

    DataResponseVO putStudent(StudyAbroad studyabroad);

    DataResponseVO deleteStudent(String studentid);
}
