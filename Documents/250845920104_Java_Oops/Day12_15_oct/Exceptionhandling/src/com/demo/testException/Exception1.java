package com.demo.testException;
// handling the exception   
// now suppose take a scenario  in that you have caught another exception the exception is not occuring something differnet
// is occuring then it will not caught(so you need to mention the parent Exception then it will caught)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String args[]) {
	
	try {
        Scanner sc=new Scanner(System.in)	;
		System.out.println("Enter a Number a");
		int a=sc.nextInt();
		System.out.println("Enter a Number b");
		int b=sc.nextInt();
		
		// now divde operation
		System.out.println(a/b);  // now here when b=0; that time if you will get another exception
	}
	catch(InputMismatchException e) {
		System.out.println("Enter a valid Integer");
	}
	catch(Exception ef) {
		System.out.println("you have got this particuler exception --->"+ef.getMessage());
	}
	}
	// now for above code when there is a single catch then other exception occured then it will not hand;e
	// so you need to add another catch box and if you dont the excetion then type the parent class Exception name
	
}
