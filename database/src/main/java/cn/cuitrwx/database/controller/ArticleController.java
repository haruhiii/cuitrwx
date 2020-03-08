
package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.ArticlePO;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    
    @GetMapping("/article")
    DataResponseVO<ArticlePO> getArticle(@RequestParam("id") Integer id){
        try {
            ArticlePO article = articleService.getArticle(id);
            return article==null?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(article);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @GetMapping("/articles")
    DataResponseVO<List<ArticlePO>> getArticles(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List articles = articleService.getArticles(start,total);
            return articles == null||articles.size()==0?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(articles);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/article")
    DataResponseVO<Integer> postArticle(@RequestBody ArticlePO newArticle){
        try {
            return  articleService.postArticle(newArticle) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/article")
    DataResponseVO<Integer> putArticle(@RequestBody ArticlePO newArticle){
        try {
            return  articleService.putArticle(newArticle) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @DeleteMapping("/article")
    DataResponseVO<Integer> deleteArticle(@RequestParam Integer id){
        try {
            return  articleService.deleteArticle(id) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }


}
