package org.ljn.test;

import org.ljn.entity.Student;
import org.ljn.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		Student student1 = (Student)context.getBean("student1");
		Student student2 = (Student)context.getBean("student2");
		Teacher teacher = (Teacher)context.getBean("teacher");
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(teacher);
	}
}
