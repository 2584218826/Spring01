package com.xjt.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-13:38
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");

		Object factory = ac.getBean("factory");

		System.out.println(factory);
	}
}
