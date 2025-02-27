package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	@Bean
	@LoadBalanced
	public RestTemplate getResttemplate(){
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate resttemplate;

	@RequestMapping("/hello")
	public String hello(){
		//指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
		String url="http://provider-user/user/sayHello";

		//返回值类型和我们的业务返回值一致
		return resttemplate.getForObject(url, String.class);

	}
	@RequestMapping("/hi")
	public String hi(){
		//指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
		String url="http://provider-user/user/sayHi";

		//返回值类型和我们的业务返回值一致
		return resttemplate.getForObject(url, String.class);

	}
	@RequestMapping("/haha")
	public String haha(){
		//指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
		String url="http://provider-user/user/sayHaha";
		//返回值类型和我们的业务返回值一致
		return resttemplate.getForObject(url, String.class);

	}
}
