package com.pzampi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pzampi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
