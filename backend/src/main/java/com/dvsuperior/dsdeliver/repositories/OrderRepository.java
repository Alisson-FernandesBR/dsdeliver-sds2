package com.dvsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
