package com.demo.springboot_mvcProduct_CURD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot_mvcProduct_CURD.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
