package com.dmai.spring;

import com.dmai.spring.bean.MyEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEventDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ctx.publishEvent(new MyEvent("kkk"));
	}
}
