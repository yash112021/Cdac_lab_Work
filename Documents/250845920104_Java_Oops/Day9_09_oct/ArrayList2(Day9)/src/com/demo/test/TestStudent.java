package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService s= new StudentServiceImpl();
		int choice=0;
		// using do while loop for the menu
		do {
			System.out.println("******************************");
			System.out.println("1. add new Student \n 2. display all Student\n3. Search by id");
			System.out.println("4. Search by marks m1\n 5. update Marks m1 & m2\n6. delete by id\n7. delete by Avg Marks\n");
			System.out.println("8. search by id \n 9. sort by Name \n10 Sort By M1\n11. exit\n choice: ");
			
		choice =sc.nextInt();
		
		switch(choice) {
		
		
		// add new Student
		case 1->{
			boolean status = s.addStudent();
			if(status) {
				System.out.println("Student added successfully");
			}
			else {
				System.out.println("Not able to add student");
			}
			
		}
		//	display all Student
//		case 2->{
//			List <Student> list 
//		}
		//Search by id
		case 3->{
			
		}// Search by marks 
		case 4->{
			
		} //update Marks m1 & m2
		case 5->{
			
		}//delete by id
		case 6->{
			
		}//delete by Avg Marks
		case 7->{
			
		}// search by id 
		case 8->{
			
		}//sort by Name
		case 9->{
			
		}//Sort By M1
		case 10->{
			
		}//exit
		case 11->{
			
		}
		
		
		
		
		}
		
		
		
		}while(choice !=12);
		

	}

}
