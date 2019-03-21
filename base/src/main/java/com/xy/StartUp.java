package com.xy;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
//@MapperScan("com.xy.mapper")
@EnableScheduling
public class StartUp {
	
	public static void main(String[] args) {
		SpringApplication.run(StartUp.class, args);
	}
}
