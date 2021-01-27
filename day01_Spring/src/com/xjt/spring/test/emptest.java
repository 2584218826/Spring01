package com.xjt.spring.test;

import com.xjt.spring.ioc.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-20:45
 */
public class emptest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("auto.xml");

		Emp emp = ac.getBean("emp", Emp.class);

		System.out.println(emp);
	}
}
