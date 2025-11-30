package com.demo.deletion;

public class deleteAtlastIndex {
	
	public static void main(String [] args) {
		
		int arr[] =new int [10];
		
		int ab =0;
		
		for(int i=21; i<27;i++) {
			arr[ab]= i;
			ab++;
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+ " index -> " +arr[i]);
		}
		
		System.out.println("*************uinhj*****************************");
		for(int i=0; i<ab;i++) {
			System.out.println(i+ " index -> " +arr[i]);
		}
		
		//deleting the elements from last
		ab--;
		
System.out.println("******************************************");
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+ " index -> " +arr[i]);
		}
		
		
		System.out.println("******************************************");
		for(int i=0; i<ab;i++) {
			System.out.println(i+ " index -> " +arr[i]);
		}
		ab--;
		System.out.println("******bvhjubhjub************************************");
		for(int i=0; i<ab;i++) {
			System.out.println(i+ " index -> " +arr[i]);
		}
	}
}
