package com.sapient.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.productcatalogue.entity.Color;

@Repository
public interface ColorRepository 
        extends JpaRepository<Color, Integer> {
}
