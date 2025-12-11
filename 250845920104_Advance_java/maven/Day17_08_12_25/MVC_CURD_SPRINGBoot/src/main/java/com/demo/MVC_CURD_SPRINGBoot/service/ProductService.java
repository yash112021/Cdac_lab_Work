package com.demo.MVC_CURD_SPRINGBoot.service;



import java.util.List;

import com.demo.MVC_CURD_SPRINGBoot.beans.Product;

public interface ProductService {

	List<Product> addnewProject();

	void addprd(Product product);

	void deletebyId(int pid);

	Product findById(int pid);

}
