package com.OrderMicroService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OrderMicroService.entity.UserInfo;
import com.OrderMicroService.service.UserService;

@RestController//("/user_order")
public class UserController {
	
	private UserService  userservice;	
	
	@Autowired
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	@PostMapping("/getAllUserOrder")
	//@RequestMapping(path = "/getAllUserOrder" , method = RequestMethod.POST)

	public UserInfo getAllUserOrder(@RequestBody UserInfo userInfor) {		
		return userservice.getListOfOrder(userInfor);
	}

}
