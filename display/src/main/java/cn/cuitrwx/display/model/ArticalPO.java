package cn.cuitrwx.display.model;


import java.util.Date;

//@Component
//@ApiModel(value = "article", description = "文章对象")
public class ArticalPO {

    private Integer id;
    private String title;
    private String content;
    private String outline;
    private String status;
    private String author;

    public ArticalPO(String title, String outline, String content) {
        this.title = title;
        this.outline = outline;
        this.content = content;
    }

    public ArticalPO(Integer id, String outline, String content) {
        this.id = id;
        this.outline = outline;
        this.content = content;
    }

    public ArticalPO(Integer id, String outline) {
        this.id=id;
        this.outline=outline;
    }


    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
