package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class ObjectSerialization {

	public static void main(String[] args)  {
	
		//now we are going to try the object Serialization 
//		converting the object to the stream is  called Serialization
		// convertint the  stream to the object is called DeSerailaztion
		
		// making  a list
		List<Employee> lst=new ArrayList<>();
		
		// adding the emplye object
		
		lst.add(new Employee(25,"yash","SE",2500.500));
		lst.add(new Employee(26,"shanparker","tl",5900.500));
		
		// //now here to we have to do chaining 
		try(ObjectOutputStream oos=new  ObjectOutputStream (new FileOutputStream("Empdata1.txt"));)
		{
			for(Employee e : lst) {
				oos.writeObject(e);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			//read data from file and display on the screen
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Empdata1.txt"));){
			while(true) {
				Employee e = (Employee) ois.readObject();
				System.out.println(e);
			}
		} catch(EOFException eof) {
			System.out.println(eof.getMessage());
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
