package com.demo.categorywebservice1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.categorywebservice1.beans.Category;
import com.demo.categorywebservice1.dto.CategoryDto;
import com.demo.categorywebservice1.service.CategoryService;

// now we are going to use the restful Service

@RestController
public class CategoryController {
		
	// creating the object of the Service
	CategoryService pserv;

	
	// now we are going to require the ResponseEntity which will return the data and the status code

	@GetMapping("/getcat/{cid}")
	public ResponseEntity<Category> findByid(@PathVariable int cid){
		Category c=pserv.findByCategory(cid);
		if(c!=null) {
			return ResponseEntity.ok(c);
		}
		return (ResponseEntity<Category>) ResponseEntity.notFound();
	}
	
	// another Mapping which will return the CategoryDto 
	@GetMapping("/categoryProduct/{cid}")
	public ResponseEntity<CategoryDto> getBycid(@PathVariable int cid){
		CategoryDto c=pserv.findBycid(cid);
		return ResponseEntity.ok(c);
	}
	
	


	
}