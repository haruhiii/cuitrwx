package cn.cuitrwx.database.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ApiModel(value = "article", description = "文章对象")
public class Article {
    private String articleid;
    private String title;
    private String content;
    private String status;
    private String author;
    private Date createTime;
    private Date deployTime;
    private Date modifyTime;

    public String getArticleid() { return articleid; }

    public void setArticleid(String articleid) { this.articleid = articleid; }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }


}
