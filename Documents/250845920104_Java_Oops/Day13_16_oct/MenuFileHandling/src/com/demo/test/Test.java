package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		// main MEnu
		//creating the object of the service one
		EmployeeService serv=new EmployeeServiceImpl();
		serv.readFile("C:\\Users\\IET\\Desktop\\250845920104_Java_Oops\\Day13_16_oct\\MenuFileHandling\\src\\empserialization.txt");
		
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("1. add new Employee\n2. delete by id\n");
			System.out.println("3. modify by Sal by id\n4.display all\n5. display by id\n6. exit\nchoice:");
			
			System.out.println("Enter the Choice --->");
			choice = sc.nextInt();
			// switch case
			
			switch(choice ) {
			
			case 1->{
				// adding new Empployee
				boolean status =serv.addNewEmployee();
				if(status) {
					System.out.println("Employee Added Successfully ");
				}else {
					System.out.println("Employee not added ");
				}
			}
			case 2-> { 

				System.out.println("Enter id");
				int empid=sc.nextInt();
				boolean status =serv.deleteById(empid);
				if(status) {
					System.out.println("Employee deleted Successfully ");
				}else {
					System.out.println("Employee not found ");
				}
			} 
			case 3->{
				
				//modify by id 
				System.out.println("Enter id");
				int empid=sc.nextInt();
				System.out.println("Enter salary");
				double sal=sc.nextDouble();
				
				boolean status = serv.modifyById(empid,sal);
				if(status) {
					System.out.println("salary updated successfully");
				}
				else {
					System.out.println("salary not updated");
				}
				
			}
			case 4->{
				// display all (here we will get the list in the output)
				List<Employee> yash=serv.getAllEmployee();
				//display by using the looop
				yash.forEach(System.out::println);
				
				
			}
			case 5->{
				// display by id 
				System.out.println("Enter the Employee id");
				int idid=sc.nextInt();
				// we will get the Employee
				Employee e=serv.getEmployeebyid(idid);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Employee not found");
				}
				
			}
			
			
			case 6->{
				//exit 
				serv.writeData("empserialization.txt");
				System.out.println("Thankyou for Attention");
			}
			
			default->  {
				System.out.println("Wrong choice!!!!");
			}
			
			}
			
			
		}while(choice !=6);
		
		
	}

}
