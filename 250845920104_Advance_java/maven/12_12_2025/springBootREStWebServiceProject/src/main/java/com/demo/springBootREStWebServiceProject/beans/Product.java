package com.demo.springBootREStWebServiceProject.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Creating a Product Class


@Entity(name="yashprod")
public class Product {
	@Id
	private int pid;
	private String pname;
	private int qty;
	private double price;
	
	// now data 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate mfgdate;
	private int cid;
	
	// PARAMETERSIED CONSTRUCTOR
	public Product(int pid, String pname, int qty, double price, LocalDate mfgdate, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
		this.cid = cid;
	}

	
	// DEFAULT CONSTRUCTOR
	public Product() {
		super();
	}

	// getters and setters
	
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


	public LocalDate getMfgdate() {
		return mfgdate;
	}


	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}
	

	// TO STRING METHOD

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", mfgdate=" + mfgdate
				+ ", cid=" + cid + "]";
	}
	
	
	
	
	
	
	
	
}
