package com.demo.beans;

public class MyUser {
	// DATE MEMEBER 
	private int uid;
	private String uname;
	private String addr;
	
	
	// DEFAULT CONSTRUCTOR 

	public MyUser() {
		super();
	}
	


	// PARMAETERISED CONSTRUCTOR
	public MyUser(int uid, String uname, String addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
	}
	// GETTERS AND SETTERS


	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}

	// TO STRING
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}

	
	
	
	
}
