package cn.cuitrwx.articledataService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@EnableSwagger2
@SpringBootApplication
@MapperScan("cn.cuitrwx.articleService.dao")
public class ArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticleApplication.class, args);
	}

}
