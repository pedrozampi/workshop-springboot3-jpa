package com.pzampi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pzampi.course.entities.OrderItem;
import com.pzampi.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
