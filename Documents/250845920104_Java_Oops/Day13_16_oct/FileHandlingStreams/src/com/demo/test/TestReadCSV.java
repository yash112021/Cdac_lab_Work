package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestReadCSV {

	public static void main(String[] args) {
		// first creating the list
		
				List<Employee> lst=new ArrayList<>();
		try (BufferedReader br =new BufferedReader(new FileReader("Employee.txt"));)
			 {
				
				String line=br.readLine();  // reading the whole line
				
				
				while(line !=null) {
					String arr []=line.split(",");
						// making the employee  object 
					Employee e1=new Employee(1120,"yash","SE",500.020);
					lst.add(e1);
					line=br.readLine();
					
					
				}
				
				lst.forEach(System.out::println);
			}
		catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
		catch(IOException f) {
				System.out.println(f.getMessage());
			}
		
		
	
		// another Try and adding the another Employee
		lst.add(new Employee(25,"Divya","TL",2500.500));
		try (BufferedWriter bw=new BufferedWriter (new FileWriter("Employee.txt"));){
			
			
			for(Employee e:lst) {
				
				String str= e.getEid() +","+ e.getEname()+","+e.getDesg()+","+e.getSal();
				 bw.write(str);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
