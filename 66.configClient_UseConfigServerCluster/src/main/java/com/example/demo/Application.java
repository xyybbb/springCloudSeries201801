package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
//此处不需要启动configClient，也没有这个Spring注解
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Value("${appName}")
    String appName;
	
	@Value("${AppNumber}")
    String AppNumber;
	
    @RequestMapping(value = "/hiAppName")
    public String hi(){
        return "从配置中心返回的是："+appName;
    }
    
    @RequestMapping(value = "/hiAppNumber")
    public String hi2(){
        return AppNumber;
    }
}
