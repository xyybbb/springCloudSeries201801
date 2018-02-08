package com.example.demo.service;

import org.springframework.stereotype.Component;

//这个注解必须有
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}