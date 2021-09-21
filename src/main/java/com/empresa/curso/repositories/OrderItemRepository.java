package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
