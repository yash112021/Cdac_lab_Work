package com.demo.springBootREStWebServiceProject.controller;

import java.util.List;

import org.hibernate.metamodel.internal.EntityRepresentationStrategyPojoStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springBootREStWebServiceProject.dto.ProductDto;
import com.demo.springBootREStWebServiceProject.service.productService;


// now this our Product Controller


@RestController
public class Product {

	// CREATING THE OBJECT OF THE SERVIE
	@Autowired
	productService pserv;
	
	// now here we are going to Wriiten the Response Entity
	// this entity is for showing the products
	@GetMapping("/showprd")
	public ResponseEntity<List<ProductDto>> showproduct() {
		// now taking this method till dao and get the list from the database
		List<ProductDto> lst=pserv.showallProduct();
		return ResponseEntity.ok(lst);
	}
	
	
	// now we want to find the the product by the Id
	@GetMapping("/prd/{pid}")
	public ResponseEntity<ProductDto> getbyid(@PathVariable int pid){
		// now we will get the proudctdto
		ProductDto p=pserv.findbyid(pid);
		if(p!=null) {
			return ResponseEntity.ok(p);
		}else {
			return (ResponseEntity<ProductDto>) ResponseEntity.notFound();
		}
	}
	
	// now we are going to  add the product
	@PostMapping("/addProduct")
	// now here we are using the @RequestBody we are requesting the spring to 
//	whatever input bring it and convert it to object of the product dto
	public ResponseEntity<String> addproduct(@RequestBody ProductDto p){
		// get the status whether added or not
		boolean status=pserv.addProduct(p);
		if(status) {
			return ResponseEntity.ok("New Product Added Succesfully -->");
		}else {
			return ResponseEntity.ok("Failed to add the product ");
		}
	}
	
	
	// now here we are going to to update the product  we are going to use the http verb as  the put
	@PutMapping("/updateprod")
	public ResponseEntity<String> updateprod(@RequestBody ProductDto p){
		// status wriiten to us
		boolean status=pserv.updateproduct(p);
		if(status) {
			return ResponseEntity.ok(" Product Updated  Succesfully -->");
		}else {
			return ResponseEntity.ok("Failed to Update the product ");
		}
	}
	
	
	// now we are going to try for delete now 
	@DeleteMapping("/deleteMapping/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid){
		boolean status=pserv.deleteById(pid);
		if(status) {
			 return ResponseEntity.ok("Deleted Succesfully ");
		}else {
			return ResponseEntity.ok("failded to delete");
		}
	}
	
}
