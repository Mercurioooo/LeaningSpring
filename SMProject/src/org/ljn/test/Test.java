package org.ljn.test;

import org.ljn.entity.Student;
import org.ljn.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService studentService = (IStudentService)context.getBean("studentService");
		Student student = new Student();
		student.setAge(818);
		student.setName("wk");
		student.setNumber(1);
		studentService.addStudent(student);
	}
}
