package cn.cuitrwx.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.SlidePO;
import cn.cuitrwx.database.service.SlideService;


@RestController
public class SlideController {

    @Autowired
    private SlideService slideService;

    @GetMapping("/slides")
    public  DataResponseVO<List<SlidePO>> getSlides(){
        try {
            List slides = slideService.getSlides();
            return slides==null?
                 new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(slides);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @GetMapping("/slides/deleted")
    public DataResponseVO<List<SlidePO>> getDeletedSlides(){
        try {
            List slides = slideService.getDeletedSlides();
            return slides==null?
                 new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(slides);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PutMapping("/slide")
    public DataResponseVO<Integer> putSlide(@RequestBody SlidePO newSlide) {
        try {
            Integer result = slideService.putSlide(newSlide);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/slide")
    public DataResponseVO<Integer> postSlide(@RequestBody SlidePO newSlide) {
        try {
            Integer result = slideService.postSlide(newSlide);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @DeleteMapping("/slide")
    public DataResponseVO<Integer> deleteSlide(@RequestParam Integer id ) {
        try {
            Integer result = slideService.deleteSlide(id);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @DeleteMapping("/slide/restore")
    public DataResponseVO<Integer> restoreSlide(@RequestParam Integer id ) {
        try {
            Integer result = slideService.restoreSlide(id);
            return result!=1?
                 new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(result);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
}
