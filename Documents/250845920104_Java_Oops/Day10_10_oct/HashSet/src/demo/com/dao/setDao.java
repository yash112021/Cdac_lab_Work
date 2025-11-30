package demo.com.dao;

import java.util.List;
import java.util.Set;

import demo.com.beans.EmployeeSet;

public interface setDao {

	boolean save(EmployeeSet e);

	Set<EmployeeSet> displayAll();

	EmployeeSet searchById(int id);

	Set<EmployeeSet> serachByName(String nm);

	boolean uptSalById(int a, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	Set<EmployeeSet> searchBySal(double sal);


	 List<EmployeeSet> sortBySal();

	List<EmployeeSet> sortbyName();



}
