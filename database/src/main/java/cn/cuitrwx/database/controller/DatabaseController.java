package cn.cuitrwx.database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DatabaseController {

    @GetMapping("/helloworld")
    public  String getSlideData(){
        return "helloworld";
    }

}
