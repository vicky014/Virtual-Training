package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prorest")
public class Product {
	
	
	@Id
	private int productid;
	@Column
	private String productname;
	@Column
	private int cost;
	
	
	
	public Product(String productname, int cost, int productid) {
		super();
		this.productname = productname;
		this.cost = cost;
		this.productid = productid;
	}
	
	public Product() {
		super();
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	
	
	

}
