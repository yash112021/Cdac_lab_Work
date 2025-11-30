package com.demo.testException;

import java.util.Scanner;

public class SalaryThrowExp {
	public static void main(String args[]) {
		
		//now we are going to make custom exception,, here we will make our own exception 
		//now we are going accept the salary in double and if we 
//		pass the salary in negative also but java does not give any error bcz negative is also a number 
//		so we have to make our own exception to throw the error 
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter salary");
			double sal = sc.nextDouble();
			
			if(sal<0) {
				throw new NullPointerException("Salary cannot be negative");
				
			}
			System.out.println("Salary is ->" + sal);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
}
}