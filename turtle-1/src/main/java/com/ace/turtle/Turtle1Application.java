package com.ace.turtle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ace.turtle.mapper")
public class Turtle1Application {

	public static void main(String[] args) {
		SpringApplication.run(Turtle1Application.class, args);
	}

}
