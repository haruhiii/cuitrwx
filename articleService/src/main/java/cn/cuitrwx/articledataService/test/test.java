package cn.cuitrwx.articledataService.test;

import cn.cuitrwx.articledataService.model.Article;
import cn.cuitrwx.articledataService.model.DataResponseVO;
import cn.cuitrwx.articledataService.model.UpdateArticle;
import cn.cuitrwx.articledataService.service.ArticleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class test {
    @Autowired
    private ArticleDataService ArticleDataService;

    @GetMapping("/article")
    DataResponseVO<Article> getArticle(String articleid) {
        return ArticleDataService.getArticle(articleid);
    }

    @GetMapping("/allarticle")
    DataResponseVO<List<Article>> getArticle() {
        return ArticleDataService.getAllArticle();
    }

    @PostMapping("/article")
    DataResponseVO PostArticle(Article article) {
        return ArticleDataService.postArticle(article);
    }

    @DeleteMapping("/article")
    DataResponseVO deleteArticle(String articleid) {
        return ArticleDataService.deleteArticle(articleid);
    }

    @PutMapping("/article")
    DataResponseVO putArticle(UpdateArticle updateArticle) {
        return ArticleDataService.putArticle(updateArticle);
    }

}
