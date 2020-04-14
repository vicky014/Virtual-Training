package com.jpa;

import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.dao.StudentDaoImpl;
import com.jpa.entity.Student;
//import com.jpa.service.StudentService;
//import com.jpa.service.StudentServiceImpl;
import com.jpa.service.StudentServiceImpl;

@SpringBootApplication
public class JpaBootApplication implements CommandLineRunner{

	@Autowired
	Student s;
	
	@Autowired
	StudentServiceImpl sd;
	
	//StudentDaoImpl sd;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//sd.create(s);
		System.out.println("Created");
		Scanner sc=new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println("Menu\n1.add\n2.remove\n3.update\n4.find\n5.alldisplay\n6.exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: sd.addStudent(s);break;
			case 2: sd.removeStudent(s);break;
			case 3: sd.updateStudent(s);break;
			case 4: System.out.println(sd.findById());break;
			case 5: System.out.println(sd.display());break;
			case 6:System.exit(0);
			default : System.out.println("Wrong Input");
			}	
		
		}
		
		
	}

}
