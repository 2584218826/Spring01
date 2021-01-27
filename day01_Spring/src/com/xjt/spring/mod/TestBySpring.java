package com.xjt.spring.mod;

import com.xjt.spring.di.Student;
import com.xjt.spring.di.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/12-15:14
 */
public class TestBySpring {
	public static void main(String[] args) {

		//初始化容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		//获取对象
////		Person person = (Person)ac.getBean("person");
//		//使用此方法获取对象时，要求spring所管理得此类型对象只有一个
////		Person person = ac.getBean(Person.class);
//
//		Person person = ac.getBean("person", Person.class);
//		System.out.println(person);


		ApplicationContext act = new ClassPathXmlApplicationContext("beans-di.xml");

//		Student student = act.getBean("student", Student.class);
//
//		System.out.println(student);
//		Student s2 = act.getBean("s2", Student.class);
//
//		System.out.println(s2);
//
//		Student s3 = act.getBean("s3", Student.class);
//
//		System.out.println(s3);
//
//		Student s4 = act.getBean("s4", Student.class);
//
//		System.out.println(s4);
//
//		Teacher tt = act.getBean("tt", Teacher.class);
//
//		System.out.println(tt);

		Teacher tt2 = act.getBean("tt2", Teacher.class);

		System.out.println(tt2);

//		Teacher tt3 = act.getBean("tt3", Teacher.class);
//
//		System.out.println(tt3);
	}
}
