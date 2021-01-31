package com.educandoweb.workshop_springbootjpamaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop_springbootjpamaven.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
