package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	boolean deleteById(int empid);

	boolean modifyById(int empid, double sal);

	List<Employee> getAllEmployee();

	Employee getEmployeebyid(int idid);

	void readFile(String string);

	void writeData(String string);

}
