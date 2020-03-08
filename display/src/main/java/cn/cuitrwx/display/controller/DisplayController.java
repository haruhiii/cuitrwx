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
public class DisplayController {
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

    @GetMapping("/article")
    ResponseVO getArticle(@RequestParam("id") Integer id){
        try {
            return new ResponseVO(displayService.getArticle(id));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseVO(ErrorCode.FAILED,"display/article 发生错误");
        }

    }
    
    @GetMapping("/articles")
    ResponseVO getArticles(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List articles = displayService.getArticles(start,total);
            if(articles == null||articles.size()<total){
                return new ResponseVO(articles,ErrorCode.EMPTY,"没有更多数据");
                
            }else{
                return new ResponseVO(articles);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseVO(ErrorCode.FAILED,"display/articles 发生错误");
        }

    }
    
    
    @GetMapping("/questions")
    ResponseVO getQuestions(){
        try {
            List questions = displayService.getQuestions();
            if(questions == null){
                return new ResponseVO(questions,ErrorCode.EMPTY,"没有更多数据");
                
            }else{
                return new ResponseVO(questions);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseVO(ErrorCode.FAILED,"display/questions 发生错误");
        }

    }





    // /** 获取轮播图数据
    //  *
    //  * @return
    //  */
    // @GetMapping("/notice")
    // public  ResponseVO getNotice(){
    //     NoticePO notice = displayService.getNotice();
    //     return new ResponseVO(notice);
    // }

    // /** 获取第 start 至 end 的文章数据
    //  *
    //  * @param start 文章开始下标
    //  * @param end   文章结束下标
    //  * @return
    //  */
    // @GetMapping("/posts")
    // public  ResponseVO getPostData(Integer start,Integer end){
    //     List postData = displayService.getPost(start,end);
    //     return new ResponseVO(postData);
    // }

    // /** 获取指定文章内容
    //  *
    //  * @param id 文章号
    //  * @return
    //  */
    // @GetMapping("/post")
    // public  ResponseVO getPostContent(String id){
    //     ArticlePO postContent = displayService.getPostContent(id);
    //     return new ResponseVO(postContent);
    // }

    // /** 获取常见问题
    //  *
    //  * @return
    //  */
    // @GetMapping("/questions")
    // public  ResponseVO getQuestions(){
    //     List questions = displayService.getQuestions();
    //     return new ResponseVO(questions);
    // }

}
