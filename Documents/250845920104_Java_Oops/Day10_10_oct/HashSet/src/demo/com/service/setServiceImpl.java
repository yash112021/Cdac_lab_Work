package demo.com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import demo.com.beans.EmployeeSet;
import demo.com.dao.setDao;
import demo.com.dao.setDaoImpl;

public class setServiceImpl implements setService{
	
	private setDao edao;
	

	public setServiceImpl() {
		super();
		edao = new setDaoImpl();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter employee name");
		String nm = sc.next();
		System.out.println("Enter employee salary");
		double sal = sc.nextDouble();
		System.out.println("Enter employee joining date");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		EmployeeSet e = new EmployeeSet(id,nm,sal,ldt);
		return edao.save(e);
	
	}

	@Override
	public Set<EmployeeSet> displayAll() {
		
		return edao.displayAll();
	}

	@Override
	public EmployeeSet searchById(int id) {
		// TODO Auto-generated method stub
		return edao.searchById(id);
	}

	@Override
	public Set<EmployeeSet> findbyname(String nm) {
		return edao.serachByName(nm);
	}

	@Override
	public boolean updateSalById(int a, double sal) {
	
		return edao.uptSalById(a,sal);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return edao.deleteById(id);
	}

	@Override
	public boolean deleteBySal(double sal) {
	
		return edao.deleteBySal(sal);
	}

	@Override
	public Set<EmployeeSet> searchBySal(double sal) {
	
		return edao.searchBySal(sal);
	}

	@Override
	public  List<EmployeeSet> sortBySal() {
		
		return edao.sortBySal();
	}

	@Override
	public List<EmployeeSet> sortByName() {
		return edao.sortbyName();
	}

	
}
