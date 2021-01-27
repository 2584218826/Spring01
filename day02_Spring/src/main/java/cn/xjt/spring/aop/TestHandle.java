package cn.xjt.spring.aop;

import org.junit.Test;
import org.springframework.stereotype.Component;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/16-17:53
 */
@Component
public class TestHandle {
	public void test()
	{
		System.out.println("这是一个切入点的测试");
	}
}
