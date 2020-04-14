package com.cg.dao;

import com.cg.entity.Product;

public interface DaoInt {

	public Product getProduct(int productid);
	public String addProduct(Product product);
	public String removeProduct(int productid);
	public String updateProduct(Product product);
	
}
