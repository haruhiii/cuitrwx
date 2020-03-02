package cn.cuitrwx.display.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cn.cuitrwx.display.model.DataResponseVO;
import cn.cuitrwx.display.model.SlidePO;

@FeignClient(name = "database")
public interface IDatabaseFeign {
     @GetMapping("/slides")
     DataResponseVO<List<SlidePO>> getSlides();
}