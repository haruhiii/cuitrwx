package cn.cuitrwx.database.model.PO;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ApiModel(description = "文章")

public class Article {
    private Integer id; //文章编号
    private String title;   //标题
    private String outline; //摘要
    private String content; //正文
    private Date createTime; //创建时间

    public Integer getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
