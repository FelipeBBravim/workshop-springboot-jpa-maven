package com.educandoweb.workshop_springbootjpamaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop_springbootjpamaven.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
