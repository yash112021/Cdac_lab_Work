package demo.com.service;

import java.util.List;
import java.util.Set;

import demo.com.beans.EmployeeSet;

public interface setService {

	boolean addNewEmployee();

	Set<EmployeeSet> displayAll();

	EmployeeSet searchById(int id);

	Set<EmployeeSet> findbyname(String nm);

	boolean updateSalById(int a, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	Set<EmployeeSet> searchBySal(double sal);

	 List<EmployeeSet> sortBySal();

	List<EmployeeSet> sortByName();
	

}
