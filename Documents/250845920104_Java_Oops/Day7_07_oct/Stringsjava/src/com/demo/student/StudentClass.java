//3. Write a menu driven program to maintain student information. Modify  Student class 
//created in previous assignment.  Add a member gpa in student class, add a function in 
//student class to return GPA of a student 
//calculateGPA() 
//gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3 
//Create an array to store Multiple students. 
//1. Display All Student 
//2. Search by id 
//3.  Search by name 
////4. calculate GPA of a student 
////5. Exit

package com.demo.student;
import java.util.*;
public class StudentClass {
		
	private int studId;
	private String studName;
	private Marks[] mlist;
	
	
	//parmaterized constructor;
	
	public StudentClass(int studId, String studName, Marks[] mlist) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.mlist = mlist;
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public Marks[] getMlist() {
		return mlist;
	}


	public void setMlist(Marks[] mlist) {
		this.mlist = mlist;
	}
	
	
	//getters and setters
	
	
	
	
	
	
	
	
	public static void acceptStudent() {
		
		
		
	}


	
 
}
