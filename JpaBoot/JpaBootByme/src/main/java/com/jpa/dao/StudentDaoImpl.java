package com.jpa.dao;

import java.util.List;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Student;


@Component
@Transactional
public class StudentDaoImpl implements IntDao{

	Scanner sc=new Scanner(System.in);
	
	@PersistenceContext
	EntityManager em;

	
	
	@Override
	public void create(Student s) {
		
		em.persist(s);
		
	}
	
	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("select s from Student s");
		return q.getResultList();
	}

	@Override
	public Student findById() {
		System.out.println("Enter Id you want to find : ");
		
		int id=sc.nextInt();
		return em.find(Student.class, id);
	}

	@Override
	public void removeStudent(Student s) {
System.out.println("Enter Id you want to delete : ");
		
		int id=sc.nextInt();
		
		 em.remove(em.find(Student.class, id));
		System.out.println("Removed");
		
	}

	@Override
	public void addStudent(Student s) {
		System.out.println("Enter Id : ");
		int id=sc.nextInt();
		s.setId(id);
		System.out.println("enter Name : ");
		String name=sc.next();
		s.setName(name);
		System.out.println("enter Department : ");
		String dept=sc.next();
		s.setDept(dept);
		
		em.persist(s);
		System.out.println("Added");
		
	}

	@Override
	public void updateStudent(Student s) {
		
		System.out.println("Enter Id you want to update : ");
		
		int id=sc.nextInt();
		
		 em.remove(em.find(Student.class, id));
		 s.setId(id);
		 System.out.println("Enter name : ");
		 String name=sc.next();
		 s.setName(name);
		 System.out.println("enter department");
		 String dept=sc.next();
		 s.setDept(dept);
		 
		 em.persist(s);
		 System.out.println();
		 
		
		
	}

	
}
