package com.dallaproracing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dallaproracing.demo.entities.OrderItem;
import com.dallaproracing.demo.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
