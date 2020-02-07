package cn.cuitrwx.commonproblemsService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("cn.cuitrwx.cpmmonproblemsService.dao")
public class CommonproblemsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonproblemsServiceApplication.class, args);
	}

}
