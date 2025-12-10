package com.demo.categorywebservice1.service;

import com.demo.categorywebservice1.beans.Category;
import com.demo.categorywebservice1.dto.CategoryDto;

public interface CategoryService {

	

	CategoryDto findBycid(int cid);

	Category findByCategory(int cid);

}
