package com.xjt.spring.proxy;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/15-15:12
 */
public class ProxyUtil{

	private MathImpl mathimpl;

	public ProxyUtil(MathImpl mathimpl) {
		this.mathimpl = mathimpl;
	}

	public Object getProxy()
	{
		//获取当前类的类加载器，用来加载代理对象的所属类
		ClassLoader classLoader = this.getClass().getClassLoader();
		//获取目标对象实现得所有接口得class，代理类会和目标类实现相同的接口，最终通过代理对象实现功能
		Class[] interfaces = mathimpl.getClass().getInterfaces();


		return Proxy.newProxyInstance(classLoader,
				interfaces,
				//代理对象实现功能的方式
				new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				MyLogger.before(method.getName(), Arrays.toString(args));
				Object result = method.invoke(mathimpl, args);
				MyLogger.after(method.getName(), result);
				return result;   //动态代理对象实现功能
			}
		});
	}

}
