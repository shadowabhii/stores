package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.services.IProductServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	@Autowired
	private IProductServiceImpl productService;
	
	@PostMapping("/addProduct")
	public Integer addProduct(@RequestBody Product product) {
		
		int id = productService.addProduct(product);
		
		return id;
		
	}
	
	@GetMapping("/allProduct")
	public List<Product> getAllProduct()
	{
		return productService.getAllProduct();
	}

}
