package com.dmai.spring.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
