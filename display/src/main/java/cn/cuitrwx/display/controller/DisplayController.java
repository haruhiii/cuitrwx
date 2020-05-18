package cn.cuitrwx.display.controller;

import cn.cuitrwx.display.model.ErrorCode;
import cn.cuitrwx.display.model.Program;
import cn.cuitrwx.display.model.ResponseVO;
import cn.cuitrwx.display.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/programs")
    ResponseVO<List<Program>> getPrograms(){
        try {
            List programs = displayService.getPrograms();
            if(programs == null){
                return new ResponseVO(programs,ErrorCode.EMPTY,"没有更多数据");
                
            }else{
                return new ResponseVO(programs);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseVO(ErrorCode.FAILED,"display/programs 发生错误");
        }

    }

}
