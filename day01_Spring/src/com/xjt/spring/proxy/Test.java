package com.xjt.spring.proxy;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/15-15:06
 */
public class Test {

	public static void main(String[] args) {



		MathI m = new MathImpl();

		ProxyUtil p = new ProxyUtil((MathImpl) m);

		MathI proxy = (MathI) p.getProxy();

		int add = proxy.add(1, 1);

		System.out.println(add);
//
//		int add = m.add(1, 2);
//
//		System.out.println(add);
//
//		System.out.println(m.div(8,4));
	}
}
