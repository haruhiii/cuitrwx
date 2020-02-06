package cn.cuitrwx.articledataService.model;

import io.swagger.annotations.ApiModel;

import java.util.Date;


@ApiModel(value = "UpdateArticle", description = "修改文章对象")
public class UpdateArticle {
    private String articleid;


    private String title;
    private String content;
    private String author;
    private Date modifyTime;

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
