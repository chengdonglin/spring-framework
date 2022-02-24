package com.dmai.spring;

import com.dmai.spring.bean.MyClassPathXmlApplication;
import com.dmai.spring.bean.Person;
import org.springframework.context.ApplicationContext;

public class MyClassPathXmlApplicationDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new MyClassPathXmlApplication("beans.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person.getName());
	}
	/**
	 * 既然在方法postProcessBeanFactory能获取BeanFactory
	 * 不仅可以修改BeanDefinition的信息， 而是整个容器beanFactory级别的信息都可以修改了
	 * 这也是开发的时候一个非常重要的扩展手段
	 */
}
