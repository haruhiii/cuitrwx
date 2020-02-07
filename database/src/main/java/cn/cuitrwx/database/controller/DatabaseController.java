package cn.cuitrwx.database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DatabaseController {

    /** 获取轮播图数据
     *
     * @return
     */
    @GetMapping("/helloworld")
    public  String getSlideData(){
        return "helloworld";
    }

}
