package cn.cuitrwx.display.controller;

import cn.cuitrwx.display.model.PostPO;
import cn.cuitrwx.display.model.ResponseVO;
import cn.cuitrwx.display.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisplayController {
    @Autowired
    DisplayService displayService;

    /** 获取轮播图数据
     *
     * @return
     */
    @GetMapping("/slide")
    public  ResponseVO getSlideData(){
        List slideData = displayService.getSlide();
        return new ResponseVO(slideData);
    }

    /** 获取第 start 至 end 的文章数据
     *
     * @param start 文章开始下标
     * @param end   文章结束下标
     * @return
     */
    @GetMapping("/posts")
    public  ResponseVO getPostData(Integer start,Integer end){
        List postData = displayService.getPost(start,end);
        return new ResponseVO(postData);
    }

    /** 获取指定文章内容
     *
     * @param id 文章号
     * @return
     */
    @GetMapping("/post")
    public  ResponseVO getPostContent(String id){
        PostPO postContent = displayService.getPostContent(id);
        return new ResponseVO(postContent);
    }

    /** 获取常见问题
     *
     * @return
     */
    @GetMapping("/questions")
    public  ResponseVO getQuestions(){
        List questions = displayService.getQuestions();
        return new ResponseVO(questions);
    }

}
