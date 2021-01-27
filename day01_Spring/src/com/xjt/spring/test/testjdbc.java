package com.xjt.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-15:24
 */
public class testjdbc {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("datesource.xml");

		DruidDataSource bean = ac.getBean("datesourrce", DruidDataSource.class);

		System.out.println(bean.getConnection());
	}
}
