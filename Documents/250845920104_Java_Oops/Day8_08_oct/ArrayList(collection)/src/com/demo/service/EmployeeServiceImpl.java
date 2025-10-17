package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService  {
	
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		// writing the code to add the employee
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id--> ");
		int id=sc.nextInt();
		
		System.out.println("Enter the Employee name");
		String nm=sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Salary");
		double sal=sc.nextDouble();
		
		System.out.println("Enter the joining Date -->(dd/MM/YYYY)");
		String dt=sc.next();
		LocalDate ab = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e1 = new Employee(id, nm, sal, ab);
		return edao.save(e1);
		
	
	}

	@Override
	// implementation for the the display  
	public List<Employee> displayAll() {
		
		return edao.findAll();
	}

	@Override
	public Employee searchById(int eid) {
		return edao.findById(eid);
	}

	@Override
	public List<Employee> searchByName(String name) {
		// TODO Auto-generated method stub
		return edao.searchByName(name);
	}

	@Override
	public boolean updateById(int id, double sal) {
		
		return edao.modfiySalById(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		
		return edao.deleteByIdEmp(id);
	}

	@Override
	public boolean deleteBySal(double sal) {
		
		return edao.removeBySal(sal);
	}

	@Override
	public List<Employee> searchBySal(double sal) {
		
		return edao.searchBySal(sal);
	}

	@Override
	public List<Employee> sortBySal(double salery) {
		
		return edao.sortbysal(salery);
	}

	
	}
	
	
	
	
	
	
	
	
	
	


