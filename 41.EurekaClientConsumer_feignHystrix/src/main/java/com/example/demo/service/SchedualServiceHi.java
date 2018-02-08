package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by superFatxu on 2018/1/1.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	/**
     * 这里需要注意的两个地方
     * <p>
     * 1、在这里不支持GetMapping注解，如果用这个注解，不能启动
     * <p>
     * 2、@PathVariable需要设置value，如果不设置也不能成功启动
     * 
     * @param id    
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
