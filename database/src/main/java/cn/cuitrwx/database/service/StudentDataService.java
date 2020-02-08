package cn.cuitrwx.database.service;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Studentdata;


public interface StudentDataService {
    DataResponseVO<Studentdata> getStudentData(String id);

    DataResponseVO postStudentData(Studentdata studentdata);

    DataResponseVO putStudentData(Studentdata studentdata);

    DataResponseVO deleteStudentData(String id);
}
