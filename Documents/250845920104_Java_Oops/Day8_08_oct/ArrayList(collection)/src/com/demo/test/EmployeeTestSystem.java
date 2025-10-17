package com.demo.test;
import java.util.*;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


// this is our main class
public class EmployeeTestSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// now making the object of the Service package components
		// by using the interface we have made the object the class that has inherited the interface
		EmployeeService packEService = new EmployeeServiceImpl();
		
		int choice =0;
		
		do {
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n 9. sort by salary\n10. exit\n choice: ");
			
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			
			switch(choice) {
				case 1 ->{boolean status = packEService.addEmployee();
							if(status) {
								System.out.println("Added successfully");
								
							}else {
								System.out.println("Not found");
							}
				}// case 1 end
				case 2 ->{
					// display all case 2
					List <Employee> elist=packEService.displayAll();
					elist.forEach(System.out::println);
					
				} //case 2 end
				
				case 3 -> {
					
					System.out.println("Enter id to search");
					int eid = sc.nextInt();
					
					Employee e = packEService.searchById(eid);
					if(e!=null) {
						System.out.println(e);
					}
					else {
						System.out.println("not found");
					}
				}//case 3 end
				
				//search by name
				case 4 ->{
					System.out.println("Enter the name of the Employee--> ");
					String name=sc.next();
					
					// for empty line
					sc.nextLine();
					
					List<Employee> gh= packEService.searchByName(name);
					if(gh!=null) {
						System.out.println(gh);
					}
					else {
						System.out.println("not found the employee -->> "+name );
					}
					
				}
				
				case 5 -> {
					//update salary
					System.out.println("Enter the id");
					int id = sc.nextInt();
					System.out.println("Enter the salary");
					double sal = sc.nextDouble();
					boolean status = packEService.updateById(id,sal);
					if(status) {
						System.out.println("salary updated Succesfully congrats your are promoted");
					}else {
						System.out.println("sorry id not found/present");
					}
					
				}
				
				// delete  by id 
				case 6->{
					System.out.println("Enter the id");
					int id = sc.nextInt();
					boolean status=packEService.deleteById(id);
					if(status) {
						System.out.println(id+" -->  has being deleted Sucesfully");
					}else {
						System.out.println("sorry id not found/present");
					}
					
				}
				
				//delete by salary
				case 7 ->{
					
					System.out.println("Enter the salary of employee");
					double sal = sc.nextDouble();
					boolean status = packEService.deleteBySal(sal);
					if(status) {
						System.out.println(sal+" -->  has being deleted Sucesfully");
					}else {
						System.out.println("sorry id not found/present");
					}
					
				}
				//search by salary
				case 8 ->{
					System.out.println("Enter the salary");
					double sal = sc.nextDouble();
					List<Employee> elist = packEService.searchBySal(sal);
					if(elist != null) {
						elist.forEach(System.out::println);
					}
					else {
						System.out.println("The employee you are searching is not there");
					}
				}
				//sort by the salary
				case 9->{
					System.out.println("Enter the Salary");
					double salery=sc.nextDouble();
					List<Employee> elist1 = packEService.sortBySal(salery);
					if(elist1 != null) {
						elist1.forEach(System.out::println);
					}else {
						System.out.println(salery+" --> the Employee matching with this salary is not there");
					}
				}
			
			}
			
		}while(choice!=10);

	}

}
