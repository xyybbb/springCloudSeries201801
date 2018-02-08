package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

//@EnableHystrix
//@EnableHystrixDashboard
//@EnableCircuitBreaker
//feign內部已經支持了短路器，但feign的短路器沒有試驗成功.可能是Edgware版本的bug？？
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
