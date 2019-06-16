package com.springApp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.springApp.app.model.Product;
import com.springApp.app.rep.dao;





@Service

public class ProductService {

	@Autowired 
	dao daoP ;
	
	public ProductService() {
		
	}

	public void  addp(Product p) {
	
		daoP.addProoduct(p);
		
	}
	
	public List<Product> findAll(){
		
	return daoP.findAll();
		
	}
	
	public Product findProduct(String code ){
		
		return daoP.findPoduct(code);
			
		}
}
