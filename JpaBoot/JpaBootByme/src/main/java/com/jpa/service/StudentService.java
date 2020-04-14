package com.jpa.service;

import java.util.List;

import com.jpa.entity.Student;

public interface StudentService {
	
	public void create(Student s);
	public abstract List<Student> display();
	public abstract Student findById();
	public abstract void removeStudent(Student s);
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);

}
