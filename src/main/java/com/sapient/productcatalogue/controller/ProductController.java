package com.sapient.productcatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productcatalogue.entity.Product;
import com.sapient.productcatalogue.exception.CustomException;
import com.sapient.productcatalogue.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> products = productService.findAll();
		if(products==null || products.isEmpty()) 
			throw new CustomException("Product not found!");
			
		return new ResponseEntity<List<Product>>(products, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/filter/{filter}/{value}")
	public ResponseEntity<List<Product>> getProducts(@PathVariable String filter,
			@PathVariable String value) {
		List<Product> products = productService.getProducts(filter, value);
		if(products==null || products.isEmpty()) 
			throw new CustomException("Product not found!");
		
		return new ResponseEntity<List<Product>>(products,
				new HttpHeaders(), HttpStatus.OK);
	}

}