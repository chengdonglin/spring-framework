package com.dmai.spring;

import com.dmai.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
		System.out.println("helloworld");
	}
}
