package cn.cuitrwx.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.mapper.ArticleMapper;
import cn.cuitrwx.database.model.PO.Article;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private ArticleMapper articleMapper;

    @GetMapping("/article")
    DataResponse<Article> getArticle(@RequestParam("id") Integer id){
        try {
            Article article = articleMapper.getArticle(id);
            return article==null
                    ? new DataResponse<>(ErrorCode.EMPTY)
                    : new DataResponse<>(article);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @GetMapping("/articles")
    DataResponse<List<Article>>  getArticles(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List<Article> res = articleMapper.getArticles(start,total);
            return res == null || res.size() == 0
                    ? new DataResponse<>(ErrorCode.EMPTY)
                    : new DataResponse<>(res);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PostMapping("/article")
    DataResponse<Integer> postArticle(@RequestBody Article newArticle){
        try {
            return new DataResponse<>(articleMapper.postArticle(newArticle));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/article")
    DataResponse<Integer> putArticle(@RequestBody Article newArticle){
        try {
            return new DataResponse<>(articleMapper.putArticle(newArticle));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    
    @DeleteMapping("/article")
    DataResponse<Integer> deleteArticle(@RequestParam Integer id){
        try {
            return new DataResponse<>(articleMapper.deleteArticle(id));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

}
