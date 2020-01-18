package org.ljn.test;

import org.ljn.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		Student student1 = (Student)context.getBean("student1");
		Student student2 = (Student)context.getBean("student2");
		Student student3 = (Student)context.getBean("student3");
		Student student4 = (Student)context.getBean("student4");
		
		System.out.println("value注入    "+student);
		System.out.println("<value>注入  "+student1);
		System.out.println(" 空值方法1:  "+student2);
		System.out.println(" 空值方法2:  "+student3);
		System.out.println("null的<value> "+student4);
		
	}
}
