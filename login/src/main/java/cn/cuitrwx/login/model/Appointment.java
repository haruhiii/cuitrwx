package cn.cuitrwx.login.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ApiModel(description = "会面预约")
public class Appointment {

    private Integer id;//预约编号
    private String openid;//预约人编号
    private String matter;//事件
    private String comment;//备注
    private Integer status;//状态
    private Date requestDate;//预约日期
    private Date ensureTime;//预约时间

    public Integer getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getEnsureTime() {
        return ensureTime;
    }

    public void setEnsureTime(Date ensureTime) {
        this.ensureTime = ensureTime;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
