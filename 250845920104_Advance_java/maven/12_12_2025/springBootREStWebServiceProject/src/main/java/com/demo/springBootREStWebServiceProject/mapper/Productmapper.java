package com.demo.springBootREStWebServiceProject.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.springBootREStWebServiceProject.beans.Product;
import com.demo.springBootREStWebServiceProject.dto.ProductDto;



public class Productmapper {
		// now here this  class is being used for the converion pupose beccaure deut to the data
	
	// here both the Method are static what is going to come and what is going to  be wriiten
	
//	ProductDto ---> product
	public static Product toProduct(ProductDto a) {
		return new Product(a.getPid(),a.getPname(),a.getQty(),a.getPrice(),LocalDate.parse(a.getLdtr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),a.getCid());
		
	}
	// here the extra thing is the about the data 
//	LocalDate.parse(a.getLdtr(),DateTimeFormatter.ofpatterm("dd/MM/yyyy"))
	
	
	
	// **********2 Method 
	public static ProductDto toProductDto(Product p) {
		if(p.getMfgdate()==null) {
			return new ProductDto(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),null,p.getCid());
			
		}
		else {
		return new ProductDto(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
		}
	}
	
//	return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());

}

