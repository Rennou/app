package com.springApp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springApp.app.model.Product;
import com.springApp.app.rep.dao;

@Service
public class ProductService {

	@Autowired 
	dao daoP ;
	
	public ProductService() {
		
	}

	public void  addp() {
		
		Product p = new Product();
		p.setCode("code1");
		p.setName("produit1");
		p.setPrice(22);
	
		daoP.addProoduct(p);
		
	}
	
	public List<Product> findAll(){
		
	return daoP.findAll();
		
	}
	
	
}
