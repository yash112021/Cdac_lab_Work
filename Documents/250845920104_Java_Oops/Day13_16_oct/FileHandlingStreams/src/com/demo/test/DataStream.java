package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("datastream.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("datastream.txt"));){
			
			dos.writeDouble(346.32);
			dos.writeInt(123);
			dos.writeUTF("Hello we are in CDAC");
			System.out.println("read data");
			double num = dis.readDouble();
			int num1 = dis.readInt();
			String nm = dis.readUTF();
			System.out.println("num---> " + num +"num1---> "+num1+ "name--->"+nm);
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
