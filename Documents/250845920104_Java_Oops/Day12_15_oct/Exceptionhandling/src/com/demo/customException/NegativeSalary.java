package com.demo.customException;

public class NegativeSalary extends Exception{
	
	// making the constructor
	public NegativeSalary(String msg) {
		System.out.println(msg);
	}
	
}
