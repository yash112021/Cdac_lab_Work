package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestAop {
	public static void main(String[] args) {
		// in this function we are going to test the Spring Feature the Aspect of Programming 
		// creating the object of the Application Context
		ApplicationContext ctx =new ClassPathXmlApplicationContext("springconfig.xml");
		MyUser u=(MyUser) ctx.getBean("myUser");
//		System.out.println(u);
		
		u.f1();
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		u.f2();
		
		((AbstractApplicationContext) ctx).close();
		
		
		
//		u1.m1();
//		int ans=u1.m2(12);
//		System.out.println("Answer : "+ans);
//		System.out.println(u1.getName());
		
	}
}
