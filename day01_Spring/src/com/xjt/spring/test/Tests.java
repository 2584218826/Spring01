package com.xjt.spring.test;

import com.xjt.spring.life.Person;
import com.xjt.spring.spoce.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-14:19
 */
public class Tests {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("life.xml");

		Person person = ac.getBean("person", Person.class);

		person.init();

		person.setId(1);

		person.toString();

		person.destroy();
	}



	@Test
	public void test()
	{
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("life.xml");

		Person person = ac.getBean("person", Person.class);

		System.out.println(person);

		ac.close();
	}
}
