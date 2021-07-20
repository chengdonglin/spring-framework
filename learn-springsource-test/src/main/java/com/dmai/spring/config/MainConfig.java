package com.dmai.spring.config;

import com.dmai.spring.bean.Person;
import org.springframework.context.annotation.Bean;

public class MainConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("lcd");
		return person;
	}
}
