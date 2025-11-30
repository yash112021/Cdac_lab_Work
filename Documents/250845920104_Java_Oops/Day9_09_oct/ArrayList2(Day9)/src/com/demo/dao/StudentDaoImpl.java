package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	//making list of student
	
	static List <Student> slist;
	
	static {
		slist = new ArrayList<>();
		List l= new ArrayList<>();
		l.add(45);
		l.add(50);
		l.add(65);
		slist.add(new Student(1, "Yash", l));
		l.clear();
		l.add(75);
		l.add(80);
		l.add(95);
		slist.add(new Student(2, "Narayan", l));
		l.clear();
		l.add(65);
		l.add(70);
		l.add(55);
		slist.add(new Student(3, "Rajesh", l));
	}

	@Override
	public boolean addStudent() {
		// TODO Auto-generated method stub
		return false;
	}


	
		
		
		
		
	
	}


