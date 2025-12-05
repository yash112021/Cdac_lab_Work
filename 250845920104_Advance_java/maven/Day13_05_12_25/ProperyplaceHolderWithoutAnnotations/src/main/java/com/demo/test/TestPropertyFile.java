package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestPropertyFile {
	public static void main(String[] args) {
		//now picking up the data from the Data Properties  File
		// creating the ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		// getting the Bean
		MyUser usr=(MyUser) ctx.getBean("u1");
		System.out.println(usr);
	}
}
