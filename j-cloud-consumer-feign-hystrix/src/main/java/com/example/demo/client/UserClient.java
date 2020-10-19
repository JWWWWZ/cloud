package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/10/19 0019
 * @author jiangwenzhu
 * @version 1.0
 */
@FeignClient("provider-user")
public interface UserClient {

	@RequestMapping(value = "/user/sayHello", method = RequestMethod.GET)
	String hello();

	@RequestMapping(value = "/user/sayHi", method = RequestMethod.GET)
	String sayHi();

	@RequestMapping(value = "/user/sayHaha", method = RequestMethod.GET)
	String sayHaha();
}
