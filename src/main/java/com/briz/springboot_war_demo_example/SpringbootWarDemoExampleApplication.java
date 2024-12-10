package com.briz.springboot_war_demo_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringbootWarDemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWarDemoExampleApplication.class, args);
	}
	@RequestMapping("/hello")
	public String hello()
	{
		return "This is war test only";
	}
	@RequestMapping("/war")
	public String war()
	{
		return "This is war test only again";
	}
	

}
