package com.demo.beans;

import java.util.List;

// making the Student Class
public class Student {
	private int id;
	private String name;
	private List<Integer> mks;
	
	//constructor
	public Student(int id, String name, List<Integer> mks) {
		super();
		this.id = id;
		this.name = name;
		this.mks = mks;
	}
	
	//getters and Setters

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getMks() {
		return mks;
	}

	public void setMks(List<Integer> mks) {
		this.mks = mks;
	}
	// tostring Method 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mks=" + mks + "]";
	}

	
}
