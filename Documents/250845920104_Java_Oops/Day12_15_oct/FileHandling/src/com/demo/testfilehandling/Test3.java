package com.demo.testfilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		//now in the previous we did many changes like so many try and catch that is not looking so good ,making global objects and closing them in finally
		
		//java gives features of autoclosable so need not to write close it will save automatically
		
		try(FileInputStream fis = new FileInputStream("text1.txt");
			FileOutputStream fos = new FileOutputStream("copyautoclosable3.txt");	){
			 
			int i = fis.read();
			
			while(i!=-1) {
				fos.write(i);
				i= fis.read();
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
