package com.sapient.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.productcatalogue.entity.ProductCategory;

@Repository
public interface ProductCategoryRepository 
        extends JpaRepository<ProductCategory, Integer> {
 
}
