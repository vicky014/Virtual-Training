package com.cg.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DaoImp;
import com.cg.entity.Product;

@Service
public class ProductService {

	@Autowired
	private DaoImp daoimp;
	
	public Product getProduct(int productid)
	{
		return daoimp.getProduct(productid);
	}
	
	public String addProduct(Product product)
	{
		return daoimp.addProduct(product);
	}
	
	public String removeProduct(int productid) {
		Product d=daoimp.getProduct(productid);
		if(d!=null)
		{
		return daoimp.removeProduct(productid);
		}
		else
			throw new RuntimeException("id not exits");
		}
	
	public String updateProduct(Product product) {
		
		int id=product.getProductid();
		Product d=daoimp.getProduct(id);
		
		if(d!=null)
		{
			return daoimp.updateProduct(product);
		}
		else
			throw new RuntimeException("id not exits");
		
		
		
	}
}
