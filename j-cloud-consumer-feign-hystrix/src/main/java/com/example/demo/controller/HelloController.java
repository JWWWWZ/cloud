package com.example.demo.controller;

import com.example.demo.client.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/10/19 0019
 * @author jiangwenzhu
 * @version 1.0
 */
@RestController
public class HelloController {

	@Autowired
	public UserClient feignClient;

	@GetMapping("/hello")
	@HystrixCommand(fallbackMethod = "helloFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
	})
	public String hello(){
		return feignClient.hello();
	}

	@HystrixCommand(fallbackMethod = "hiFallback", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
	})
	@GetMapping("/hi")
	public String hi(){
		return feignClient.sayHi();
	}

	@GetMapping("/haha")
	@HystrixCommand(fallbackMethod = "hahaFallback")
	public String haha(){
		return feignClient.sayHaha();
	}

	public String helloFallback(){
		return "请求数据没拿到-hello";
	}

	public String hiFallback(){
		return "请求数据没拿到-hi";
	}

	public String hahaFallback(){
		return "请求数据没拿到-haha";
	}
}
