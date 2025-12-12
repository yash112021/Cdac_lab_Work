package com.demo.springBootREStWebServiceProject.service;

import java.util.List;

import com.demo.springBootREStWebServiceProject.controller.Product;
import com.demo.springBootREStWebServiceProject.dto.ProductDto;

public interface productService {

	List<ProductDto> showallProduct();

	ProductDto findbyid(int pid);

	boolean addProduct(ProductDto p);

	boolean updateproduct(ProductDto p);

	boolean deleteById(int pid);



}
