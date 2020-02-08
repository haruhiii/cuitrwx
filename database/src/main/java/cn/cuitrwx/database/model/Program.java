package cn.cuitrwx.database.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ApiModel(description = "留学项目")
public class Program {

    private String overseas_study_id;
    private String title;
    private String content;
    private int status;
    private Date createtime;

    public String getOverseas_study_id() {
        return overseas_study_id;
    }

    public void setOverseas_study_id(String overseas_study_id) {
        this.overseas_study_id = overseas_study_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
