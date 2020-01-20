package org.ljn.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ljn.entity.Student;
import org.ljn.mapper.StudentMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentMapper {

	@Override
	public void addStudent(Student student) {
		SqlSession session = super.getSqlSession() ;
		StudentMapper studentDao = session.getMapper(StudentMapper.class) ;
		studentDao.addStudent(student);
	}
	
}
