package com.dmai.spring;

import com.dmai.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonPostProcessDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person.getName());
	}
}
