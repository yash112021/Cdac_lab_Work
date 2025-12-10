package com.demo.beans;

public class Student {
	// data Member
	private String ename;
	private String eid;
	private String phoneno;
	
	
	// PARAMTERISED CONSTRUCTOR 
	
	public Student() {
		super();
	}


	// DEFAULT CONSTRUCTOR
	public Student(String ename, String eid, String phoneno) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.phoneno = phoneno;
	}


	// GETTERS AND SETTERS
	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	// To String Methpd
	@Override
	public String toString() {
		return "Student [ename=" + ename + ", eid=" + eid + ", phoneno=" + phoneno + "]";
	}
	
	
	
	
	
}
