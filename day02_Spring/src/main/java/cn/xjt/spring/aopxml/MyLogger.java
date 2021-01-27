package cn.xjt.spring.aopxml;

import org.springframework.stereotype.Component;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/17-13:09
 */

@Component
public class MyLogger {

	public void before()
	{
		System.out.println("前置通知");
	}
}
