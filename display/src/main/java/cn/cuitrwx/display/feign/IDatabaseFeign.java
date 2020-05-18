package cn.cuitrwx.display.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.cuitrwx.display.model.ArticlePO;
import cn.cuitrwx.display.model.ConfigPO;
import cn.cuitrwx.display.model.DataResponseVO;
import cn.cuitrwx.display.model.Program;
import cn.cuitrwx.display.model.QuestionPO;
import cn.cuitrwx.display.model.SlidePO;

@FeignClient(name = "database")
public interface IDatabaseFeign {
     @GetMapping("/slides")
     DataResponseVO<List<SlidePO>> getSlides();
     
    @GetMapping("/article")
    DataResponseVO<ArticlePO> getArticle(@RequestParam("id") Integer id);

    @GetMapping("/articles")
    DataResponseVO<List<ArticlePO>> getArticles(@RequestParam("start") Integer start,@RequestParam("total")  Integer total);

    @GetMapping("/questions")
    DataResponseVO<List<QuestionPO>> getQuestions();
    
    @GetMapping("/programs")
    DataResponseVO<List<Program>> getPrograms();
    

}