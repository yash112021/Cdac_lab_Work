package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	List<Employee> searchByName(String name);

	boolean updateById(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	List<Employee> searchBySal(double sal);

	List<Employee> sortBySal(double salery);




	

	
	


}
