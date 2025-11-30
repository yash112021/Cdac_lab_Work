package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements  EmployeeDao{

	//loading data in the array list
	 static	List<Employee> lstemp ;
	  static {
		 lstemp = new ArrayList<>();
		lstemp.add(new Employee(101, "Yash", "Manager", 50000)); 
		lstemp.add(new Employee(102, "Rajan", "SE", 40000)); 
		lstemp.add(new Employee(103, "Ayush", "Assitant professor", 35000)); 
	  }
	
	
	//Adding employee 
	@Override
	public boolean save(Employee employee) {
		
		return lstemp.add(employee);
	}

     // remove  by id
	@Override
	public boolean removeById(int empid) {
		
		return lstemp.remove(new Employee(empid));
	}

	//update salary by id
	@Override
	public boolean modifyBySal(int empid, double sal) {
		int pos=lstemp.indexOf(new Employee(empid));   // first getting the object
		if(pos!=-1) {   // checking
			lstemp.get(pos).setSal(sal);
			return true;
		}
		
		return false;
	}

	// find all the Employee
	@Override
	public List<Employee> findAllEmployee() {
		// returning the list 
		return lstemp;
	}

	@Override
	public Employee getEmplyee(int idid) {
		int pos=lstemp.indexOf(new Employee(idid));   // first getting the object
		if(pos!=-1) {   // checking
		return	lstemp.get(pos);
			
		}
		
		return null;
	}

	
	//for reading the data from the file
	@Override
	public void read(String string) {
		File f =new File(string);
		if(f.exists()) {
			try (ObjectInputStream io=new  ObjectInputStream(new FileInputStream(string));){
				
				//reading the data 
				while(true) {
					Employee e = (Employee)io.readObject();
					lstemp.add(e);
				}
				
			} 
			catch (EOFException  e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		 
	}
	
	//write data

	@Override
	public void writedata(String string) {
		// Writing data
		try(ObjectOutputStream obb= new ObjectOutputStream (new FileOutputStream(string))){
			for(Employee x:lstemp) {
				obb.writeObject(x);
			}
			
			
		}catch(FileNotFoundException  eg) {
//			System.out.println(eg.getMessage());
			eg.printStackTrace();
		}
		catch(IOException eg) {
//			System.out.println(eg.getMessage());
			eg.printStackTrace();
		}
		
	}
	
	
			

			
}
