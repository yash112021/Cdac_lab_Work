package com.demo.testException;

import java.util.InputMismatchException;
import java.util.Scanner;

// input Number Mismatch  Exeption
public class InputNumberMismatch {

	public static void main(String[] args) {
		// taking an input from user 
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		
		System.out.println("a-->"+ a);
		}
		// when you dont handle exeption then then red lines will so you need handle
		catch(InputMismatchException e) {
			System.out.println("you entered the wrong number please correct it");
		}

	}

}
