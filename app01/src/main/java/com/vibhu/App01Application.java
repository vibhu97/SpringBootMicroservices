package com.vibhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //eureka Server
public class App01Application {

	public static void main(String[] args) {
		SpringApplication.run(App01Application.class, args);
	}

}