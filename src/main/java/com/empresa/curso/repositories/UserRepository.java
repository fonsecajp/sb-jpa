package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
