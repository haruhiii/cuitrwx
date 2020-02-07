package cn.cuitrwx.display.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "database")
public interface IDisplayFeign {
    @RequestMapping("/helloworld")
    String helloworld() ;
}