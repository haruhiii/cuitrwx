package cn.cuitrwx.display.controller;

import cn.cuitrwx.display.model.ArticlePO;
import cn.cuitrwx.display.model.ErrorCode;
import cn.cuitrwx.display.model.NoticePO;
import cn.cuitrwx.display.model.ResponseVO;
import cn.cuitrwx.display.model.SlidePO;
import cn.cuitrwx.display.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    DisplayService displayService;

    /**
     * 获取轮播图数据
     *
     * @return
     */
    @GetMapping("/slides")
    public ResponseVO getSlideData() {
        try {
            return new ResponseVO(displayService.getSlide());
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseVO(ErrorCode.FAILED,"display/getSlideData 发生错误");
        }
    }


}
