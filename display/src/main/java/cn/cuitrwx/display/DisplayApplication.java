package cn.cuitrwx.display;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
public class DisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayApplication.class, args);
	}

}
