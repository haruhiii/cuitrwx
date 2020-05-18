package cn.cuitrwx.login.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ApiModel(description = "学生信息对象")
public class StudentPO {
    private String openid;
    private String name;
    private String studentid;
    private String className;
    private String grade;
    private String major;
    private String academy;
    private String avatarUrl;
    private String province;
    private String city;
    private Integer gender;
    private String nickName;
    private String language;
    private String country;
    private String sessionKey;
    private String phone;
    private Boolean compeleted;

    public String getAcademy() {
        return academy;
    }

    public Boolean getCompeleted() {
        return compeleted;
    }

    public void setCompeleted(Boolean compeleted) {
        this.compeleted = compeleted;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getName() {
        return name;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}