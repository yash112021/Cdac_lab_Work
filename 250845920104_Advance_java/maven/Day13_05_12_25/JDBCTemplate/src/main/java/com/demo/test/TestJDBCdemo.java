package com.demo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBCdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// creating the object of the ApplicationContext
		ApplicationContext ctx =new ClassPathXmlApplicationContext("springconfig.xml");
		// now we need to create the object of the product Service now we don't need to create it the Spring framework create for us
		
		
		int choice =0;
		System.out.println("1.Add New Product \n2.Display all \n3. display by Category \n4.display by all ");
		System.out.println("5.delete by pid \n6.Modify By ID \n7.Arrange in Sorted Order \n8.exit \n choice....");
		
		choice=sc.nextInt();
		switch(choice) {
			case 1->{
				
			}
		}
		
	}

}
