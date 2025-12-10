package com.demo.categorywebservice1.beans;

public class Category {
	// data Member of the Category class
	private int cid;
	private String cname;
	private String cdesc;
	
	//	Default constructor 
	public Category() {
		super();
	}

	// PARAMTERISED CONSTRUCTOR 
	public Category(int cid, String cname, String cdesc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cdesc = cdesc;
	}

	// ALL THE GETTERS AND SETTERS
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", cdesc=" + cdesc + "]";
	}
	
	
	
	
	

}
