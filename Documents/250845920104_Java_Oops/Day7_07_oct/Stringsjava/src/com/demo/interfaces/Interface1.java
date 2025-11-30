package com.demo.interfaces;

public interface Interface1 {
	
	public void eat();
	
	void sleep();
	
	default void run() {
		System.out.println("This is the Interface");
	}
                                                                                                                                                                                                                                        
}
