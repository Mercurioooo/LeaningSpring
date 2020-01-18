package org.ljn.entity;


public class Teacher {
	String name;
	Student student;
	public Teacher() {
		
	}
	public Teacher(String name, Student student) {
		super();
		this.name = name;
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", student=" + student + "]";
	}
	
}
