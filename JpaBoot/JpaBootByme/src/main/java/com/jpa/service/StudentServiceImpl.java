package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.dao.StudentDaoImpl;
import com.jpa.entity.Student;
@Component
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDaoImpl sd;

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return sd.display();
	}

	@Override
	public Student findById() {
		// TODO Auto-generated method stub
		return sd.findById();
	}

	@Override
	public void removeStudent(Student s) {
		// TODO Auto-generated method stub
		sd.removeStudent(s);
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		sd.addStudent(s);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		sd.updateStudent(s);
	}

	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		sd.create(s);
	}

	

}
