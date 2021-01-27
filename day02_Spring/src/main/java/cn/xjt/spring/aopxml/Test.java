package cn.xjt.spring.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/17-13:16
 */
public class Test {
	ApplicationContext ac = new ClassPathXmlApplicationContext("aop-xml.xml");

	@org.junit.Test
	public void test()
	{
		MathI m = ac.getBean("mathImpl", MathI.class);

		int add = m.add(1, 1);

		System.out.println(add);
	}
}
