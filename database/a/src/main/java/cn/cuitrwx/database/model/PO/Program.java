package cn.cuitrwx.database.model.PO;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;


@Component
@ApiModel(description = "留学项目")
public class Program {

    private Integer id;
    private String title;
    private String description;
    private String detail;
    private Float score;
    private String time;
    private String requirement;
        
    public String getDescription() {
        return description;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRequire() {
        return requirement;
    }

    public void setRequire(String require) {
        this.requirement = require;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

}
