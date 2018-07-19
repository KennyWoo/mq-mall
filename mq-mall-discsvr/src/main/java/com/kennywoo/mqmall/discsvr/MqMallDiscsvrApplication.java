package com.kennywoo.mqmall.discsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MqMallDiscsvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqMallDiscsvrApplication.class, args);
    }
}
