package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{

	// creating the object of studentDaoImpl with the help of interface
	StudentDao sdao; 
	
	public StudentServiceImpl() {
		sdao = new StudentDaoImpl();
	}
	
	
	@Override
	public boolean addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id");
		int id = sc.nextInt();
		System.out.println("Enter the student name");
		String name = sc.next();
		List l;
		System.out.println("Enter the student marks");
		return false;
	
			
		}
		

}
