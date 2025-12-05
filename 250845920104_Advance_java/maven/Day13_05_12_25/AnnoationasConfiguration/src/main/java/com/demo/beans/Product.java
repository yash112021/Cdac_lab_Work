package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Product {
	// Data Members
	@Value("20")
	private int pid;
	@Value("Bread")
	private String pname;
	@Value("2")
	private int qty;
	@Value("50.263")
	private double price;
	// now here we are going to perform the AutoWring
	@Autowired
	private Category cat;

	
	// DEFAULT CONTRUCTOR
	public Product() {
		super();
	}

	// PARMATERISED CONSTRUCTOR
	public Product(int pid, String pname, int qty, double price, Category cat) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.cat = cat;
	}

	
	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	// GETTERS AND SETTERS
	public int getPid() {
		return pid;
	}

	
	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	// To String Method 
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", cat=" + cat + "]";
	}

	

	
}	
