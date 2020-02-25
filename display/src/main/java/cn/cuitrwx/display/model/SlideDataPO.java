package cn.cuitrwx.display.model;

import java.util.List;

public class SlideDataPO {

    private String src;
    private String href;

    public SlideDataPO(String src, String href) {
        this.setSrc(src);
        this.setHref(href);
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


}
