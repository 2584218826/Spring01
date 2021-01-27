package com.xjt.spring.proxy;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/15-16:13
 */
public class MyLogger {

	public static void before(String methodName,String args)
	{
		System.out.println("method:"+methodName+",arguments:"+args);
	}

	public static void after(String methodName,Object reslut)
	{
		System.out.println("method:"+methodName+",reslut:"+reslut);
	}
}
