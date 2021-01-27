package com.xjt.spring.userMod.controller;

import com.xjt.spring.userMod.service.UserService;
import com.xjt.spring.userMod.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-21:21
 */

@Controller
public class UserController {

	@Autowired  //自动装配对象
	private UserService userService;

	public void addUser()
	{
		userService.addUser();
	}
	public UserController()
	{
		System.out.println("UserController");
	}

	@Override
	public String toString() {
		return "UserController{}";
	}
}
