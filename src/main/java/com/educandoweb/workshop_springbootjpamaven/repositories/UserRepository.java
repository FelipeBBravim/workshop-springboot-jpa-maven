package com.educandoweb.workshop_springbootjpamaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop_springbootjpamaven.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
