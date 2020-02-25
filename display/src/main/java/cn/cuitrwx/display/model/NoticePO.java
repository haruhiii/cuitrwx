package cn.cuitrwx.display.model;

public class NoticePO {
    private Boolean shown;
    private String href;
    private String text;

    public NoticePO(){
        setShown(false);
    }
    
    public NoticePO(String text,String href){
        setText(text);
        setHref(href);
        setShown(true);
    }
    
    public Boolean getShown() {
        return shown;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setShown(Boolean shown) {
        this.shown = shown;
    }
}
