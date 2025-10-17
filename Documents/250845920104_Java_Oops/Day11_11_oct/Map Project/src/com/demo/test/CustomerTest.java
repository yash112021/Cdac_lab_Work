package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Items;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// making the object of service class
		CustomerService cser= new CustomerServiceImpl();
		int choice=0;
		do {
			System.out.println("\n 1.add New Customer \n2.Display All \n3. display by customer");
			System.out.println("\n 4.Delete Customer \n5.Add a Item in a Existing order \n6. Delete item from existing Order");
			System.out.println("\n 7.exit \n Enter your choice--> ");

			choice=sc.nextInt();
			
			switch(choice) {
			
			// add new Customer
			case 1 ->{
			boolean	 status= cser.addNewService();
				if(status) {
					System.out.println("Customer added Succesfully");
				}else {
					System.out.println("Sorry Customer Not Added");
				}
			}
			//display map data 
			case 2 ->{
				Map<Customer,List<Items>>  data=cser.displayyData();
				Set <Customer> li = data.keySet() ;
				li.forEach(c->System.out.println(c+"---->"+data.get(c)));
				
			
			}
			
			//display by customer id
			case 3 ->{
				
				System.out.println("Enter thd id");
				int cid = sc.nextInt();
				
			Map.Entry<Customer, List<Items>> ab= cser.displayById(cid);
				if(ab!=null) {
					System.out.println(ab.getKey()+ "--->" + ab.getValue());
				}else {
					System.out.println("Customer entered id not found");
				}	
			}
			
			// Delete the customer by id
			case 4 ->{
				System.out.println("Enter the customer id");
				int cid = sc.nextInt();
				
				boolean status=cser.removeById(cid);
				if(status) {
					System.out.println("Customer Deleted Succesfully");
				}else {
					System.out.println("Sorry Customer Not Found ");
				}
			}
			
			//add item in existing order
			case 5 ->{
				System.out.println("Enter the customer id");
				int cid = sc.nextInt();
				
				boolean status=cser.AddItemByCid(cid);
				if(status) {
					System.out.println("Items Added Succesfully");
				}else {
					System.out.println("Failed to add item ");
				}
				
			}
//			Delete item from existing Order
			case 6 ->{
				
				System.out.println("Enter the customer id");
				int cstid = sc.nextInt();
				System.out.println("Enter the Item id");
				int itmid = sc.nextInt();
				

				boolean status=cser.DeleteItemById(cstid,itmid);
				if(status) {
					System.out.println("Item Deleted Succesfully");
				}else {
					System.out.println("Sorry Item id Not Found ");
				}
				
				
			}
			case 7 ->{
				System.out.println("Thank you for visiting");
			}
			
			default -> {
				System.out.println("Wrong choice");
			}
			
			}
		}while(choice!=7);
		
		
		
	}

}
