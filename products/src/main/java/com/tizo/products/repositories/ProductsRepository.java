package com.tizo.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tizo.products.entities.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {
	
	Product findByName(String name); 
}
