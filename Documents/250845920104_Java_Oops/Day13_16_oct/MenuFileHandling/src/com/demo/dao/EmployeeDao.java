package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee employee);

	boolean removeById(int empid);

	boolean modifyBySal(int empid, double sal);

	List<Employee> findAllEmployee();

	Employee getEmplyee(int idid);

	void read(String string);

	void writedata(String string);

}
