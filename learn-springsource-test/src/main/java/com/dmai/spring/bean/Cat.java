package com.dmai.spring.bean;

public class Cat {
	private String name;

	public Cat() {
	}

	public Cat(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}
}
