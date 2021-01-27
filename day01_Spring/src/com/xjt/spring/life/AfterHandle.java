package com.xjt.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-14:54
 */
public class AfterHandle implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Person person = (Person) bean;

		if(person.getName().equals("徐江涛")){
			person.setName("彭于晏");
		}
		else{
			person.setName("胡歌");
		}

		return person;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
