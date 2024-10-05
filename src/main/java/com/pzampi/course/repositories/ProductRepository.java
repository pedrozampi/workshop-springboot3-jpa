package com.pzampi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pzampi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
