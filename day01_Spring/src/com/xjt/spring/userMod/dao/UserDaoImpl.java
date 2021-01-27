package com.xjt.spring.userMod.dao;

import com.xjt.spring.userMod.service.UserService;
import org.springframework.stereotype.Repository;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-21:23
 */

@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl()
	{
		System.out.println("UserDaoImpl");
	}

	@Override
	public int addUser() {
		System.out.println("添加成功");
		return 1;
	}
}
