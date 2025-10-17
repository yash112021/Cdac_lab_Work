package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Items;
import com.demo.dao.CustomerDao;
import com.demo.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	
	// creating the object in the constructor
	
	CustomerDao cdao;
	
	
	public CustomerServiceImpl() {
		cdao=new CustomerDaoImpl();
	}

	// add new Customer
	@Override
	public boolean addNewService() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer id");
		int cid=sc.nextInt();
		System.out.println("Enter customer name");
		String nm=sc.next();
		System.out.println("Enter customer mobile");
		String mob=sc.next();
		Customer c=new Customer(cid,nm,mob);
		//accept list of items
		
		// now creating the array list to store the data
		List<Items> itemslist=new ArrayList<>();
		
		// getting the id item name quantity and price
		String check="";
		do{
		System.out.println("enter item id");
		int id=sc.nextInt();
		System.out.println("enter item name");
		String inm=sc.next();
		System.out.println("enter item qty");
		int qty=sc.nextInt();
		System.out.println("enter item price");
		double price=sc.nextDouble();
		
		// now creating the object
		Items i1 =new Items(id,inm,qty,price);  // passing the detisl item realted
		
		itemslist.add(i1);
		System.out.println("Do you want to add more list items again -->if No-->n ");
		 check=sc.next();
		} while (check.equals("n"));
		
		return cdao.save(c, itemslist);	
		
	}

	@Override
	public Map<Customer, List<Items>> displayyData() {
		
		return cdao.displayall();
	}

	@Override
	public Entry<Customer, List<Items>> displayById(int cid) {
		
		return cdao.displayById(cid);
	}



	@Override
	public boolean AddItemByCid(int cid) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter item id");
		int id=sc.nextInt();
		System.out.println("enter item name");
		String inm=sc.next();
		System.out.println("enter item qty");
		int qty=sc.nextInt();
		System.out.println("enter item price");
		double price=sc.nextDouble();
	
		
		Items it = new Items(id, inm,qty,price);
		
//		List <Items> lst = new ArrayList<>();
//		lst.add(it);
//		lst1.add(new Items(id, inm,qty,price));
		return cdao.AddItembycid(cid,it);
		
	}

	@Override
	public boolean removeById(int cid) {
		
		return cdao.removebyid(cid);
	}

	@Override
	public boolean DeleteItemById(int cstid, int itmid) {
		
		return cdao.DeleteItemById(cstid,itmid);
	}


}
