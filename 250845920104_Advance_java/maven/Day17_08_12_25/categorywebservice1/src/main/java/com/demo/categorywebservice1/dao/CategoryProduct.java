package com.demo.categorywebservice1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.categorywebservice1.beans.Category;

@Repository
public interface CategoryProduct extends JpaRepository<Category, Integer>{

}
