package com.demo.testfilehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test1 {

	public static void main(String[] args) {
		//now reading the data from file
		
		try {
			FileInputStream fis= new FileInputStream("text1.txt"); /// reading the data from this file
			FileOutputStream fos=new FileOutputStream("copy.txt"); // if file not there then the file will get created 
			//and if exits then overwrite the data
			
			int i=fis.read();  
			
			while(i != -1) {   // untill and unless the whole file is being readed 
				fos.write(i);   // now writing in the copy.txt file
				
				 i=fis.read();  
				
			}
			//now closing the opened objects
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException f) {
			System.out.println(f.getMessage());
		}
		catch(IOException  e) {
			System.out.println("This error occured while handling the file exception -->"+e.getMessage());
		}
		

	}

}
