package com.demo.categorywebservice1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import com.demo.categorywebservice1.beans.Category;
import com.demo.categorywebservice1.dao.CategoryProduct;
import com.demo.categorywebservice1.dto.CategoryDto;
import com.demo.categorywebservice1.dto.ProductDto;

@Service
public class CategoryServiceImpl implements CategoryService{
	// creating the object of the Dao
	CategoryProduct pdao;

	// Method for findthatcategory by the cid

	@Override
	public Category findByCategory(int cid) {
		Optional<Category> c=pdao.findById(cid);
		if(c.isPresent()) {
			return c.get();
		}
		return null;
		
	}

	@Override
	public CategoryDto findBycid(int cid) {
		Category c=pdao.findById(cid)
				.orElseThrow(() -> new RuntimeException("Category not found"));;
		
		//it will send AJAX request to product webservice to get all products by category
		List<ProductDto> productList =
                restClient.get()
                        .uri("http://localhost:8585/products/category/" + cid)
                        .retrieve()
                        .body(new ParameterizedTypeReference<List<ProductDto>>() {});
		CategoryDto cdto=new CategoryDto();
		cdto.setCat(c);
		cdto.setPlist(productList);
		return cdto;
		
	}


	
	
}
