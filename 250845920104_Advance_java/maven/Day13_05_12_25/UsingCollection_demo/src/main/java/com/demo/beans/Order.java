package com.demo.beans;

import java.util.List;

public class Order {
	//data Member
	private int orderid;
	private String cname;
	// now here we are using the collection one order can have the multipe the product so taking the list
	private List<Product> plist;
	
	// default constructor 
	public Order() {
		super();
	}

	// parmeterised cosntructuor
	public Order(int orderid, String cname, List<Product> plist) {
		super();
		this.orderid = orderid;
		this.cname = cname;
		this.plist = plist;
	}

	// getters and setters
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}

	// to String Method
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", cname=" + cname + ", plist=" + plist + "]";
	}
	
	
	
	
}
