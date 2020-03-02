package cn.cuitrwx.display.model;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;

@Component
@ApiModel(description = "轮播图")
public class SlidePO {

    private Integer id;
    private Integer type;
    private String src;
    private Integer articalId;
    private String href;

    public Integer getArticalId() {
        return articalId;
    }

    public void setArticalId(Integer articalId) {
        this.articalId = articalId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


}
