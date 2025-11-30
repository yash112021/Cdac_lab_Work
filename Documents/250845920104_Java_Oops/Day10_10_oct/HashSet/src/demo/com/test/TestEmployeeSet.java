package demo.com.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import demo.com.beans.EmployeeSet;
import demo.com.service.setService;
import demo.com.service.setServiceImpl;

public class TestEmployeeSet {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		setService eservice = new setServiceImpl();
		int choice =0;
		

		do {
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 -> {
				boolean status = eservice.addNewEmployee();
				if(status) {
					System.out.println("Added successfully");
				}else {
					System.out.println("not fond");
				}
			}
			
			case 2 -> {
				Set<EmployeeSet> eset = eservice.displayAll();
				eset.forEach(System.out::println);
			}
			
			// search by name 
			case 3->{
				System.out.println("Enter Employee id--->");
				int id=sc.nextInt();
				 EmployeeSet byid= eservice.searchById(id);
				if(byid!=null) {
					System.out.println(byid);
				}else {
					System.out.println("The Employee with this "+id +"doesn't exits");
				}
			}
			
			//search by name
			case 4->{
				System.out.println("Enter Employee Name");
				String nm=sc.next();
				Set<EmployeeSet> temp=eservice.findbyname(nm);
				if(temp!=null) {
					temp.forEach(System.out::println);
				}else {
					System.out.println("Not Found");
				}
			}
			
			// update the sal by the id and taking the salary from the user
			case 5->{
				System.out.println("Enter the Id");
				int a=sc.nextInt();
				System.out.println("Enter the Salary");
				double sal=sc.nextDouble();
				
				boolean status=eservice.updateSalById(a,sal);
				if(status) {
					System.out.println("Salary update Succesfully");
				}
				else
				{
					System.out.println("Salary Not Updated Succesfully");
				}
				
			
			}
			
			
			//delete by id
			case 6 ->{
				System.out.println("Enter the Id");
				int id=sc.nextInt();
				
				boolean status=eservice.deleteById(id);
				if(status) {
					System.out.println(" Id deleted successfully");
				}
				else
				{
					System.out.println("Not found");
				}
				
			}
			
			//delte by salary
			case 7 -> {
				System.out.println("Enter the salary");
				double sal=sc.nextDouble();
				boolean status = eservice.deleteBySal(sal);
				if(status) {
					System.out.println(" Salary deleted successfully");
				}
				else
				{
					System.out.println("Not found");
				}
			}
			//search by salary
			case 8 -> {
				System.out.println("Enter the salary");
				double sal=sc.nextDouble();
				Set <EmployeeSet> s = eservice.searchBySal(sal);
				if(s !=null) {
					s.forEach(System.out::println);
				}
				else
				{
					System.out.println("Not found");
				}
			}
			
			// sort by salary
			case 9->{
				 List<EmployeeSet> s = eservice.sortBySal();
					s.forEach(System.out::println);
				
			}
			
			
			// sort by name
			case 10->{
				List<EmployeeSet> s = eservice.sortByName();
				s.forEach(System.out::println);
			}
			}
		}while(choice!=12);
		
	}

	
	

	

}
