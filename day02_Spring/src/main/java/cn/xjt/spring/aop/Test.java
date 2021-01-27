package cn.xjt.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/16-0:25
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		MathI m = ac.getBean("mathImpl", MathI.class);
		int add = m.add(5, 2);
		int div = m.div(5, 2);

		TestHandle t = ac.getBean("testHandle", TestHandle.class);
		t.test();

		System.out.println(add);
	}
}
