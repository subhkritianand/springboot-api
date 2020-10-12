package com.sapient.productcatalogue.service;

import java.util.List;

import com.sapient.productcatalogue.entity.ProductCategory;

public interface ProductCategoryService {
	List<ProductCategory> findAll();
}
