package com.demo.testfilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4Append {

	public static void main(String args[]) {
		File f = new File("copy4append.txt");
		FileOutputStream fos = null;
		try {
			
			if(f.exists()) {
				fos = new FileOutputStream("copy4append.txt", true);
			}
			else {
				fos = new FileOutputStream("copy4append.txt");
			}
		}
		catch(FileNotFoundException ef) {
		
			ef.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("text1.txt");
				FileOutputStream fos1 = fos;){
			int i = fis.read();
			
			while(i!= -1) {
				fos1.write(i);
				i = fis.read();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
