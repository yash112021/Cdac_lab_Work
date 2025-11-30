package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e1);

	List<Employee> findAll();

	Employee findById(int eid);

	List<Employee> searchByName(String name);

	boolean modfiySalById(int id, double sal);

	boolean deleteByIdEmp(int id);

	boolean removeBySal(double sal);

	List<Employee> searchBySal(double sal);

	List<Employee> sortbysal(double salery);

	
	
	

}
