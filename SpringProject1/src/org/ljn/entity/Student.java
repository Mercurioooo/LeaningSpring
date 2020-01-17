package org.ljn.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	String name;
	int number;
	int age;
	public Student() {
		
	}
	public Student(String name, int number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	
	
}
