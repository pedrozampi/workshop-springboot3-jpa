package com.pzampi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pzampi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
