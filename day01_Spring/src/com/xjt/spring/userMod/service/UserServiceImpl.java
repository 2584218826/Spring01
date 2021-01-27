package com.xjt.spring.userMod.service;

import com.xjt.spring.userMod.dao.UserDao;
import com.xjt.spring.userMod.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-21:22
 */

@Service
public class UserServiceImpl implements UserService{

	@Autowired  //自动装配对象
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}

	@Override
	public int addUser() {
		return userDao.addUser();
	}
}
