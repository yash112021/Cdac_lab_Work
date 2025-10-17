package com.demo.testException;

import java.util.Scanner;

public class MulExpSingleCatchBlock {

	public static void main(String[] args) {
		
		//here we are going to take multiple exception and single catch block 
		
		Scanner sc = new Scanner(System.in);
		try {
			int arr[] = new int [5];
//			int a[] = {1,2,3,4};
//			int b[] = {1,2,3,4};
//			int c[] = {1,2,3,4};
			arr[0] = 12;
			arr[1] = 34;
			arr[2] = 0;
			//out of bound 
			arr[7] = 23; //At this line error will be occurred becz the array is out of bound
			
			int div = arr[1] / arr[2];
			System.out.println("divide ->"+ div);
	
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException  e) {
			System.out.println(e.getMessage());
		}

	}

}
