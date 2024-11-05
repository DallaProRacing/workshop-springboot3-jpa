package com.dallaproracing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dallaproracing.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
