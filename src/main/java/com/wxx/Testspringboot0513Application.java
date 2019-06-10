package com.wxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan ("com.wxx.mapper")
public class Testspringboot0513Application {

	public static void main(String[] args) {
		SpringApplication.run(Testspringboot0513Application.class, args);
	}

}
