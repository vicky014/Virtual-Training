package com.cg.entity;

public class Student {
	
	public String name;
	public int regno;
	
	public Student() {
		super();
	}
	
	public Student(String name,int regno) {
		super();
		this.name=name;
		this.regno=regno;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	
	

}
