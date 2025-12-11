package com.demo.JWTTokens.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.JWTTokens.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
