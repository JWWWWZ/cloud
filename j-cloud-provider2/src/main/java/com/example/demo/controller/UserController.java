package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/sayHello")
	public String sayhello(){
		return "I`m provider 2 ,Hello consumer!";
	}
	@RequestMapping("/sayHi")
	public String sayHi(){
		return "I`m provider 2 ,Hi consumer!";
	}
	@RequestMapping("/sayHaha")
	public String sayHaha(){
		return "I`m provider 2 ,HaHa consumer!";
	}
}
