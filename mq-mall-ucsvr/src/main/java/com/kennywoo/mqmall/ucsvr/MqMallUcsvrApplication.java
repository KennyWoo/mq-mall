package com.kennywoo.mqmall.ucsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MqMallUcsvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqMallUcsvrApplication.class, args);
	}
}
