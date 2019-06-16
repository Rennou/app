package com.springApp.app.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springApp.app.model.Product;
import com.springApp.app.service.ProductService;



@RestController
@RequestMapping(path="/products")
public class ProductControleur {
	
	
	@Autowired
	ProductService ss ;
	
	@GetMapping(path="/save")
	public String  addProduct() 
	{
     // ss.addp();
      return "OK";
	}
	
	@GetMapping(path="/tt")
	public String t() 
	{
     
      return "OK";
	}
		

	@GetMapping(path="/all")
	public List<Product>allProduct() 
	{
     
      return ss.findAll();
	}
	
	@GetMapping("/{id}")
	public Product  getP(@PathVariable String id) 
	{
     
     return ss.findProduct(id);
	}
	
	
	@GetMapping("/test")
	public String  getP1(@PathParam(value = "tt") String tt) 
	{
     
     return "Bonjour :" +tt ;
	}
	
	@RequestMapping(path="/addProduct"  ,method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product addProduct1(@RequestBody Product p) 
	{
     
    ss.addp(p);
		
    
    return p ;
    
	}
	
	
}
