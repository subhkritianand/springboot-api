package com.sapient.productcatalogue.service;

import java.util.List;

import com.sapient.productcatalogue.entity.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProducts(String groupbyvalue, String actualvalue);
}
