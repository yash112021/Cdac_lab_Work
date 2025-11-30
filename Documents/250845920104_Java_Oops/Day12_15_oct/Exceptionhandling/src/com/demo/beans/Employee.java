package com.demo.beans;

import com.demo.customException.NegativeSalary;

public class Employee {
	private int eid;
	private String ename;
	 private double sal;
	 
	 
	 
	 //tostring
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}




	public int getEid() {
		return eid;
	}




	public void setEid(int eid) {
		this.eid = eid;
	}




	public String getEname() {
		return ename;
	}




	public void setEname(String ename) {
		this.ename = ename;
	}




	public double getSal() {
		return sal;
	}




	public void setSal(double sal)throws NegativeSalary {
		this.sal=sal;
		if(sal<0) {
			throw new NegativeSalary("salary cannot be neagtive");
		}
		if(sal>2000) {
			throw new NegativeSalary("Salary cannot be greater than 2000");
		}
	}




	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	 
	 
	
}
