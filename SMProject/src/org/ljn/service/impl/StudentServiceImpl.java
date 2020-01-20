package org.ljn.service.impl;

import org.ljn.entity.Student;
import org.ljn.mapper.StudentMapper;
import org.ljn.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentMapper studentMapper ;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}

}
