package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl  implements EmployeeDao{

	static List<Employee> elist;
	static{
		elist = new ArrayList<>();
		elist.add(new Employee(101, "Rajesh", 50000, LocalDate.of(2000, 02, 03)));
		elist.add(new Employee(102, "Mahesh", 43000, LocalDate.of(2255, 03, 03)));
		elist.add(new Employee(103, "suresh", 60000, LocalDate.of(2022, 04, 12)));
	}
	
	@Override
	public boolean save(Employee e1) {
		elist.add(e1);
		return true;
	}

	// in the dao method now 
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return elist;
	}
	
	//search by id automatic code
	@Override
	public Employee findById(int eid) {
		// in line 35 how to search in the listcollection is there
		int got=elist.indexOf(new Employee(eid));
		// now when to return and when to not that part by using the
		if(got!=-1) {
			return elist.get(got);
		}
		return null;
		// otherwise return null
		
		
		
	}

	
	// search by name we have to write the code 
	@Override
	public List<Employee> searchByName(String name) {
		List<Employee> temp = elist.stream()
				.filter(emp -> emp.getName()
						.equals(name)).collect(Collectors.toList());
	
//		List<Employee> temp= elist.stream()
//                .filter(emp->emp.getEname().equals(nm))
//                .collect(Collectors.toList());

		return temp;
	}

	// update the salary and then modify it
	@Override
	public boolean modfiySalById(int id, double sal) {
	
		int status=elist.indexOf(new Employee(id));
		if(status!=-1) {
			Employee e=elist.get(status);
			e.setSal(sal);
			return true ;
		}
		
		return false;
	}

	@Override
	//delete the emply by id --> simple function of the list 
	public boolean deleteByIdEmp(int id) {
	
		return elist.remove(new Employee(id));
	}

	// for deletinng the empolyee on the basics of the sal
	@Override
	public boolean removeBySal(double sal) {
		
		return elist.removeIf(emp -> emp.getSal() >sal);
	}

	// delete on the basics of the  searchbysal
	@Override
	public List<Employee> searchBySal(double sal) {
			List <Employee> list = elist.stream()
					.filter(emp -> emp.getSal()==sal)
					.collect(Collectors.toList());
		if(list.size()>0) {
			return list;
		}else {
			return null;
		}
	}

	
	// now to perform the sort on the bascis of the salry
	@Override
	public List<Employee> sortbysal(double salery) {

		List <Employee> lst = new ArrayList<>();
		for(Employee e : elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}
	
	
	
	
	

}
