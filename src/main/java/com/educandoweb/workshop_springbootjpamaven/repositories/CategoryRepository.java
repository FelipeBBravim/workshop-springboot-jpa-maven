package com.educandoweb.workshop_springbootjpamaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop_springbootjpamaven.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
