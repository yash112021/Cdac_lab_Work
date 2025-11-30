package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BefferedStream {

	public static void main(String[] args) {
		BufferedOutputStream bos =null;
		File f = new File("bufferedcopy.txt");
		try {
			if(f.exists()) {
				bos = new BufferedOutputStream(new FileOutputStream(f,true));
			}else {
				 bos = new BufferedOutputStream(new FileOutputStream(f));
			}
		}catch(FileNotFoundException g) {
			System.out.println(g.getMessage());
		}
		
		
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("teststream.txt"));
				BufferedOutputStream bos1=bos){
			int i = bis.read();
			while(i!= -1) {
				bos.write(i);
				i=bis.read();
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException i) {
			System.out.println(i.getMessage());
		}
	}

}
