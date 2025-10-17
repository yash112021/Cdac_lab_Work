package com.demo.functionoverloading;

public class TestFunctionOverloading {

	public static void main(String[] args) {
		
		MyTestClass m = new MyTestClass();
		
		System.out.println(m.max(5,6));
		System.out.println(m.max(5,6,8));
		System.out.println(m.max(9.5f, 6.5f));
		System.out.println(m.max("hello", "everyone"));
		System.out.println(m.max(5,6));
		System.out.println(m.add(6,1,2,3,4,7,6));

	}

}
