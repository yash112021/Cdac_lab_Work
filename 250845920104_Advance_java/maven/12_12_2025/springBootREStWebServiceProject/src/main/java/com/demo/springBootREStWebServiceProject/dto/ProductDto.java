package com.demo.springBootREStWebServiceProject.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

// this is the product dto that is being is used for the date conversion
public class ProductDto {
	
	private int pid;
	private String pname;
	private int qty;
	private double price;
	// now here the data is in the String Format
	private String ldtr;
	private int cid;
	
	// DEFAULT CONSTRUCTOR
	
	public ProductDto() {
		super();
	}



	// PARAMTERSIED CONSTRUCTOR 
	public ProductDto(int pid, String pname, int qty, double price, String ldtr, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.ldtr = ldtr;
		this.cid = cid;
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



	public String getLdtr() {
		return ldtr;
	}



	public void setLdtr(String ldtr) {
		this.ldtr = ldtr;
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", ldtr=" + ldtr
				+ ", cid=" + cid + "]";
	}
		
	// TO STRING METHOD 
	
	
}
