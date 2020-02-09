package cn.cuitrwx.database.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@ApiModel(description = "学生留学表")
public class StudyAbroad {
    private String studentid;
    private String name;
    private String reason;
    private String tel;
    private Date createTime;
    private int status; //申请留学状态
    private String overseas_study_id; //留学项目id

    public String getOverseas_study_id() {
        return overseas_study_id;
    }

    public void setOverseas_study_id(String overseas_study_id) {
        this.overseas_study_id = overseas_study_id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}