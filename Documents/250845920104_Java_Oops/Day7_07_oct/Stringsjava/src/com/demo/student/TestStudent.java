package com.demo.student;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("1.Display all student\n 2.Seach by Id\3.Search by Name");
			System.out.println("4.Calculate GPA of student\n 5.exit");
			
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				StudentClass.acceptStudent();
			}
	
			
		}while(choice != 6);
	}

}
