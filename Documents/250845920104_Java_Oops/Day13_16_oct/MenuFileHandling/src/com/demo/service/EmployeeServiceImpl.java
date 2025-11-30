package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
		// now creating the object of the dao one
		EmployeeDao edao;

		public EmployeeServiceImpl() {
		
			edao  = new EmployeeDaoImpl();
		}

		// Adding employee 
		@Override
		public boolean addNewEmployee() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id");
			int empid=sc.nextInt();
			System.out.println("Enter name of employee");
			String nm=sc.next();
			System.out.println("Enter desg");
			String desg=sc.next();
			System.out.println("Enter sal");
			double sal=sc.nextDouble();
			
			
			
			return edao.save(new Employee(empid,nm,desg,sal));
		}

//		removeById
		@Override
		public boolean deleteById(int empid) {
			return edao.removeById(empid);
		}

		//update salary by id
		
		@Override
		public boolean modifyById(int empid, double sal) {
		
			return edao.modifyBySal(empid,sal);
		}
		
		// get all the Employee
		@Override
		public List<Employee> getAllEmployee() {
			
			return edao.findAllEmployee();
		}

		@Override
		public Employee getEmployeebyid(int idid) {
			
			return edao.getEmplyee(idid);
		}

		
		//read method 
		@Override
		public void readFile(String string) {
			 edao.read(string);
		}

		//write data
		@Override
		public void writeData(String string) {
			edao.writedata(string);
			
		}
		
}
