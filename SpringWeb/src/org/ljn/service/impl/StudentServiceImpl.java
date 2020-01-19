package org.ljn.service.impl;

import org.ljn.dao.IStudentDao;
import org.ljn.dao.impl.StudentDaoImpl;
import org.ljn.service.IStudentService;

public class StudentServiceImpl  implements IStudentService{
	private IStudentDao studentDao;
	
	
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}


	
	public String queryStudentById() {
		return studentDao.queryStudentById(); 
	}

}
