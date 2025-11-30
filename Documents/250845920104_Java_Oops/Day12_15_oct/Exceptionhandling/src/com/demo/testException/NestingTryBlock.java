package com.demo.testException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestingTryBlock {
	
	//divide function , here we are using the nested try block
	public static int divide(int c, int d) {
		return c/d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter 1st number");
			int a= sc.nextInt();
			System.out.println("enter 2nd number");
			int b = sc.nextInt();
			
			try {
				
				int ans = divide(a,b);  ///now on this line exceptuion will occurr if you dont handle it error will occurr
				System.out.println(ans);
			}
			catch(Exception e ) {
				System.out.println("divide by 0 exp occor-->" +e.getMessage());
			}
		}
		catch(InputMismatchException f) {
			System.out.println("Enter  a valid number-->" +f.getMessage());
			f.printStackTrace();  ///this line will give us the whole information that which error is arrising
//			 and at which line it is arrising 
		}
		finally {
			System.out.println("this is the finally block which will always run even if error occurred or not ");
			System.out.println("so whatever part you want to get executed you should write here");
		}

	}

}
