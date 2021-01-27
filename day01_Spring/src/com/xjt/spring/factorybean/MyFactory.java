package com.xjt.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-13:27
 */
public class MyFactory implements FactoryBean<Car> {
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();

		car.setBrand("奥迪");
		car.setPrice(200000.0);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
