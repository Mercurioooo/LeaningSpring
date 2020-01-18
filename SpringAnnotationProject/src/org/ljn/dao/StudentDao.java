package org.ljn.dao;

import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDao {
	public void addStudent() {
		System.out.println("添加学生");
	}
	public boolean deleteStudent() {
		System.out.println("删除学生");
		return true;
	}
}
