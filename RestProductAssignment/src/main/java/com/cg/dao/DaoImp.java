package com.cg.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Product;

@Repository
@Transactional
public class DaoImp implements DaoInt{
	
	@PersistenceContext
	EntityManager em;
	

	public List<Product> retrieve()
	{
		Query query=em.createQuery("Select p from Product p");
		return query.getResultList();
	}
	
	public Product getProduct(int productid)
	{
		List<Product> list=retrieve();
		Product p=null;
		Optional <Product> opt= list.stream().
				filter(c->c.getProductid()==productid).findFirst();
		if(opt.isPresent()) {
			p=opt.get();
		}
		return p;	
	}
	
	public String addProduct(Product p)
	{
		em.persist(p);
		return "product added";
	}
	
	public String removeProduct(int productid) {
		em.remove(getProduct(productid));
		return "product removed";
	}
	
	public String updateProduct(Product p) {
		em.merge(p);
		return "product updated";
	}

}
