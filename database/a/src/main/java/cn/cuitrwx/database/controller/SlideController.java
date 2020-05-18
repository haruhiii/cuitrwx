package cn.cuitrwx.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.mapper.SlideMapper;
import cn.cuitrwx.database.model.PO.Slide;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

@RestController
public class SlideController {
    @Autowired
    private SlideMapper slideMapper;

    @GetMapping("/slides")
    DataResponse<List<Slide>> getSlides(){
        try {
            List<Slide> res = slideMapper.getSlides();
            return res == null || res.size() == 0
                    ? new DataResponse<>(ErrorCode.EMPTY)
                    : new DataResponse<>(res);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PostMapping("/slide")
    DataResponse<Integer> postSlide(@RequestBody Slide newSlide){
        try {
            return new DataResponse<>(slideMapper.postSlide(newSlide));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/slide")
    DataResponse<Integer> putSlide(@RequestBody Slide newSlide){
        try {
            return new DataResponse<>(slideMapper.putSlide(newSlide));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    
    @DeleteMapping("/slide")
    DataResponse<Integer> deleteSlide(@RequestParam Integer id){
        try {
            return new DataResponse<>(slideMapper.deleteSlide(id));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

}
