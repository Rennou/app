package com.springApp.app.rep;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springApp.app.model.Product;

@Repository
@Transactional
public class dao {

	@PersistenceContext
	private EntityManager em;
	
	
	
	@Transactional
	public void addProoduct(Product p) {
		
		em.merge(p);
	
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Product> findAll(){
		
	return  em.createQuery("select p from Product p").getResultList();
		
	}
	
}
