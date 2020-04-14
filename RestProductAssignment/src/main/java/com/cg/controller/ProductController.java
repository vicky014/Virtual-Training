package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductService;


@CrossOrigin(origins="http://localhost:4200")
@Component
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productservice;
	
	
	@GetMapping(value="/{productid}",produces= {"application/json"})
	public Product getProduct(@PathVariable int productid) {
		return productservice.getProduct(productid);
	}
	
	@PostMapping(value="/add",consumes= {"application/json"})
	public String addProduct(@RequestBody Product product)
	{
		return productservice.addProduct(product);
	}
	
	@DeleteMapping("/delete/{productid}")
	public String removeProduct(@PathVariable int productid) {
		return productservice.removeProduct(productid);
	}
	
	@PutMapping(value="/update",consumes= {"application/json"})
	public String updateProduct(@RequestBody Product product) {
		
		return productservice.updateProduct(product);
	}
	
}
