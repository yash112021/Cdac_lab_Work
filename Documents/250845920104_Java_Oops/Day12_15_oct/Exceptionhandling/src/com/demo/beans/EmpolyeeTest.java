package com.demo.beans;

import com.demo.customException.NegativeSalary;

public class EmpolyeeTest {

	public static void main(String[] args){
		// making an object of the employee
//		public void acceptData() throws NegativeSalary{}
		try {
		Employee e1=new Employee(112021,"yash",20000.20);
		// now setting the salary to with the help of the setter function
//		e1.setSal(-5000.2330);
		e1.setSal(1900.2330);
		System.out.println(e1);
		}
		catch(NegativeSalary e) {
			System.out.println(e.getMessage());
		}

	}

}
