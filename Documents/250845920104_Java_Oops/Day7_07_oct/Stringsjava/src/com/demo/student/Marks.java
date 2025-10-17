package com.demo.student;

public class Marks {
	
	private int marks_s1;
	private int marks_s2;
	private int marks_s3;
	//paramertized constructor
	public Marks(int marks_s1, int marks_s2, int marks_s3) {
		super();
		this.marks_s1 = marks_s1;
		this.marks_s2 = marks_s2;
		this.marks_s3 = marks_s3;
	}
	// all the getters setters
	public int getMarks_s1() {
		return marks_s1;
	}
	public void setMarks_s1(int marks_s1) {
		this.marks_s1 = marks_s1;
	}
	public int getMarks_s2() {
		return marks_s2;
	}
	public void setMarks_s2(int marks_s2) {
		this.marks_s2 = marks_s2;
	}
	public int getMarks_s3() {
		return marks_s3;
	}
	public void setMarks_s3(int marks_s3) {
		this.marks_s3 = marks_s3;
	}
	@Override
	public String toString() {
		return "Marks [marks_s1=" + marks_s1 + ", marks_s2=" + marks_s2 + ", marks_s3=" + marks_s3 + "]";
	}
	
	
	
	
}
