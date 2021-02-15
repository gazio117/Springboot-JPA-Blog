package com.miroku.jpa.repository;

import com.miroku.jpa.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository 생략가능!!
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
