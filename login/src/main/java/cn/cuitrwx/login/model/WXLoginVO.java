package cn.cuitrwx.login.model;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ApiModel(value = "WXLoginVO", description = "微信登录返回的数据")
public class WXLoginVO {
    private Integer id;
    private String property;
    private String value;

    public Integer getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
