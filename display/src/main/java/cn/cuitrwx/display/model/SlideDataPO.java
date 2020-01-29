package cn.cuitrwx.display.model;

import java.util.List;

public class SlideDataPO {

    private String image;
    private String url;

    public SlideDataPO(String image, String url){
        this.image=image;
        this.url=url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
