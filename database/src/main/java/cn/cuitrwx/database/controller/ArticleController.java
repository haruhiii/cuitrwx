

package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.Article;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.UpdateArticle;
import cn.cuitrwx.database.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ArticleController {
    @Autowired
    private cn.cuitrwx.database.service.ArticleService ArticleService;

    @GetMapping("/article")
    DataResponseVO<Article> getArticle(String articleid) {
        return ArticleService.getArticle(articleid);
    }

    @GetMapping("/allarticle")
    DataResponseVO<List<Article>> getArticle() {
        return ArticleService.getAllArticle();
    }

    @PostMapping("/article")
    DataResponseVO PostArticle(Article article) {
        return ArticleService.postArticle(article);
    }

    @DeleteMapping("/article")
    DataResponseVO deleteArticle(String articleid) {
        return ArticleService.deleteArticle(articleid);
    }

    @PutMapping("/article")
    DataResponseVO putArticle(UpdateArticle updateArticle) {
        return ArticleService.putArticle(updateArticle);
    }

}
