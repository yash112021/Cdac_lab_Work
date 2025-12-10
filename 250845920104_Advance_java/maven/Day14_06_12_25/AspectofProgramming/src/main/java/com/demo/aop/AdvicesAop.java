package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvicesAop {
	// IN THIS CLASS WE ARE GOING TO USE THE AOP CONCEPT TELL ME ABOUT THIS 
	@Before("execution (* com.demo.beans.M*.*(..))")
	public void beforeAdvice() {
		
		System.out.println("Before Advice --->");
	}
	@After("execution (* com.demo.beans.M*.*(..))")
	public void afterAdvice() {
		System.out.println("After Advice --->");
	}
	

	
	@Around("execution (* com.demo.beans.M*.f*(..))")
	public Object aroundadvice(ProceedingJoinPoint jpoint) throws Throwable {
		System.out.println("around advice but before the fucntion call");
		Object ob=jpoint.proceed();
		System.out.println("in around advice after function call-->");
		return ob;
		
	}
}
