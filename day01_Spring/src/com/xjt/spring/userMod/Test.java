package com.xjt.spring.userMod;

import com.xjt.spring.userMod.controller.UserController;
import com.xjt.spring.userMod.dao.UserDaoImpl;
import com.xjt.spring.userMod.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-21:30
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");

		UserController userc = ac.getBean("userController", UserController.class);

		System.out.println(userc);

		userc.addUser();

		UserServiceImpl service = ac.getBean("userServiceImpl", UserServiceImpl.class);

		System.out.println(service);

		UserDaoImpl dao = ac.getBean("userDaoImpl", UserDaoImpl.class);

		System.out.println(dao);
	}
}
