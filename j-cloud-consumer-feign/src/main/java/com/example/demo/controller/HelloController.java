package com.example.demo.controller;

import com.example.demo.service.UserClient;
import com.netflix.discovery.converters.Auto;
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
	private UserClient userClient;

	@GetMapping("/hello")
	public String hello(){
		return userClient.sayHello();
	}

	@GetMapping("/hi")
	public String hi(){
		return userClient.sayHi();
	}

	@GetMapping("/haha")
	public String haha(){
		return userClient.sayHaha();
	}
}
