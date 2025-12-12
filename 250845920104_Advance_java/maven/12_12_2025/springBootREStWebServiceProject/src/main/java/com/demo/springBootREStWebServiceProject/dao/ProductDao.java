package com.demo.springBootREStWebServiceProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springBootREStWebServiceProject.beans.Product;


@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
