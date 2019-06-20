package com.springApp.app.rep;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springApp.app.model.Product;







@Repository
@Transactional

public class dao {

	@PersistenceContext
	private EntityManager em;
	
	
	
	@Transactional
	public boolean addProoduct(Product p) throws SQLException {
		System.out.println("debut perssiste");
		em.persist(p);
		return  true ;
	
	}
	 
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Product> findAll(){
		
	return  em.createQuery("select p from Product p").getResultList();
		
	}
	
	
	@Transactional
	@SuppressWarnings("unchecked")
	public Product findPoduct(String code){ System.out.println("-------------------------hghh-----");

	return  em.find(Product.class, code);
		
	
}
}
