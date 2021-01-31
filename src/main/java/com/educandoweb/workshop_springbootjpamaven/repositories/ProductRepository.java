package com.educandoweb.workshop_springbootjpamaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop_springbootjpamaven.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
