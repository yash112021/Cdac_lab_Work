package com.demo.testException;

import java.util.Scanner;

import com.demo.customException.WrongPinException;

public class AtmPinTryCatchExp3Attem {
	
	
	public static void main(String []args) {
	// AtM pin generaion code by using the try catc block
	int Atmpin=8542;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
		try {
			System.out.println("Enter the Pin-->");
			int check=sc.nextInt();
			if(Atmpin!=check) {
				throw new WrongPinException("Enterd Wrromg pin please try again-->");
//				break;
			}
			System.out.println("Succesfully Loged in");{ break;}
			
		}catch(WrongPinException e) {
			System.out.println(""+e.getMessage());
		}
		
	}
	}
}
