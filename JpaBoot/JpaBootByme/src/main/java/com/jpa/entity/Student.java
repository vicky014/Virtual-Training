package com.jpa.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="sssdfe")
public class Student {
	
	
	@Id
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Dept")
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Id=" + id + " Name=" + name + " Dept=" + dept + "\n";
	}

	
	
}
