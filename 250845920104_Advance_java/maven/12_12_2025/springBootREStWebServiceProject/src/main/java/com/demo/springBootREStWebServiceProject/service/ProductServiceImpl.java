package com.demo.springBootREStWebServiceProject.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springBootREStWebServiceProject.beans.Product;
import com.demo.springBootREStWebServiceProject.dao.ProductDao;
import com.demo.springBootREStWebServiceProject.dto.ProductDto;
import com.demo.springBootREStWebServiceProject.mapper.Productmapper;

@Service
public class ProductServiceImpl implements productService {

	// making the object of the Dao
	@Autowired
	ProductDao pdao;

	@Override
	public List<ProductDto> showallProduct() {
		// now first we need to get the the product 
		List<Product> plist=pdao.findAll();
		// from data base we have got the data
		List<ProductDto> pl=plist.stream().map(x->Productmapper.toProductDto(x)).collect(Collectors.toList());
		
		// here controller is sending the request and then dao will fetch the data and then what convert 
//		it to and then send the constroller
		return pl;
	}

	
	// for finding by Id 
	@Override
	public ProductDto findbyid(int pid) {
		// now we first find the the product and then convert it 
		Optional<Product> p=pdao.findById(pid);
		if(p.isPresent()) {
			// now here conversion from product to product dto
			return Productmapper.toProductDto(p.get());  // here the p.get will give us that method 
		}
		return null;
	}



	// this for adding new product to our database from the postman or the react page
	@Override
	public boolean addProduct(ProductDto p) {
		// now the data coming to us in the form of the Product dto but we want to save in the data base in the product 
		// conversion is needed
		
		Product pa=pdao.save(Productmapper.toProduct(p));
		return pa!=null;
	}


	// update the product 
	@Override
	public boolean updateproduct(ProductDto p) {
		// now we are going to update the project 
		// first convert it to the product
		Product pr=Productmapper.toProduct(p);
		// now cheking wether it is exists or not
		Optional <Product>pa=pdao.findById(pr.getPid());
		//now if we get it then make changes
		if(pa.isPresent()) {
			// now with the help of the op getting the the object and by using the getters and applying the changes
			Product pn=pa.get();
			// now setting the values;
			pn.setPrice(p.getPrice()); // setting the new price
			pn.setQty(p.getQty());
			// now saving these
			pdao.save(pn);
			return true;
		}
		
		return false;
	}
	// 


	// now we are deleting the Method
	@Override
	public boolean deleteById(int pid) {
		// first find by using the 
		Optional<Product> pa=pdao.findById(pid);
		// if it is present then what you do try to delete it
		if(pa.isPresent()) {
			pdao.delete(pa.get());  // here the pa.get  is used to get the  reterive the object and ddelte
			return true;
			
		}
		return  false;
	}

	
}
