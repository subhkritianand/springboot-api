package com.sapient.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.productcatalogue.entity.Brand;

@Repository
public interface BrandRepository 
        extends JpaRepository<Brand, Integer> {
 
}
