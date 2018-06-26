package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value = "com.dao")
@SpringBootApplication
public class ThreeprojectApplication {

	public static void main(String[] args) {

		System.out.println("我不会，哈不会！");
		SpringApplication.run(ThreeprojectApplication.class, args);
	}
}
