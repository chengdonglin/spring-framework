package com.dmai.spring;

import com.dmai.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanFactoryProcessorDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());
	}
}
