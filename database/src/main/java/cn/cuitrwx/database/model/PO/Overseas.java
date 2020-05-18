package cn.cuitrwx.database.model.PO;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;

import java.util.Date;

@Component

@ApiModel(description = "留学申请")
public class Overseas {
    private Integer id;
    private String openid;
    private String tel;
    private String status;
    private Date createtime;
    private String name;
    private Integer programId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }


}
