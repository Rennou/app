package com.springApp.app.service;

import java.sql.SQLException;
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

	public boolean   addp(Product p) {
	
		try {
			return daoP.addProoduct(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println("Erreur de persistance");
		return false ;
		}
		
	}
	
	public List<Product> findAll(){
		
	return daoP.findAll();
		
	}
	
	public Product findProduct(String code ){
		
		return daoP.findPoduct(code);
			
		}
}
