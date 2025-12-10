package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyUser {
	// DATA MEMBER
	@Value("YASH PATIL")
	private String name;

	// DEFAULT CONTRUCTOR
	public MyUser() {
		super();
	}

	
	// PARMATERISED CONSTRCTOR 
	public MyUser(String name) {
		super();
		this.name = name;
	}


	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	// TO STRING METHOD 
	@Override
	public String toString() {
		return "MyUser [name=" + name + "]";
	}


	// now creating two extra Metod 
	public void f1() {
		System.out.println("****************** METHOD 1 ************");
	}
	public void f2() {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&& METHOD 2 &&&&&&&&&&&&&");
	}
	
	
	
}
