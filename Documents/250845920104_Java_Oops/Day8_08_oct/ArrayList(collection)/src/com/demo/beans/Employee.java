package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
	private int eid;
	private String name;
	private double sal;
	private LocalDate jtd;
	
	
	public Employee() {
		super();
	}


	public Employee(int eid, String name, double sal, LocalDate jtd) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.jtd = jtd;
	}

	//new constructor that has being created will for search by id
//	agar construtor banann in such scenario then you have to make the equals method
	public Employee(int eid2) {
		this.eid=eid2;
	}

	//equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public LocalDate getJtd() {
		return jtd;
	}


	public void setJtd(LocalDate jtd) {
		this.jtd = jtd;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", jtd=" + jtd + "]";
	}


	@Override
	public int compareTo(Employee ob) {
		// TODO Auto-generated method stub
		System.out.println("in compareTo method "+this.eid+"----"+ob.eid);
		System.out.println("Salary---> "+this.sal+"----"+ob.sal);
		return (int)(this.sal-ob.sal);
	}


	



	

}
