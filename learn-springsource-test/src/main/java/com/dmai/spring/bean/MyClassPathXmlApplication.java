package com.dmai.spring.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplication extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplication(String location) {
		super(location);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("重写ApplicationContext的postProcessBeanFactory方法。。。");
		// 获取容器中，名称为student的BeanDefination
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("person");
		// 修改 beanDefinition 中的信息
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}
}
