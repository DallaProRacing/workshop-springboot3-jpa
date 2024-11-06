package com.dallaproracing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dallaproracing.demo.entities.Order;
import com.dallaproracing.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
