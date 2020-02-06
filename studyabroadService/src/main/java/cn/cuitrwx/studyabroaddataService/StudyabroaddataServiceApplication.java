package cn.cuitrwx.studyabroaddataService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("cn.cuitrwx.articleService.dao")
public class StudyabroaddataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyabroaddataServiceApplication.class, args);
	}

}
