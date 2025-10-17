package ArrayPractice;

import java.util.Scanner;

public class CountDigitArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int arr [] = new int [50];
		
		int arr [] = {12,345,2,6,7896};
		digitCount(arr);
		

	}
	
	public static void digitCount( int arr []) {
		
		int cnt =0;
		int countEven=0;
		for(int i=0; i<arr.length ; i++) {
			int n = arr[i];
			while(n!=0) {
					 n = n/10; 
					cnt++;
				
				
			}
			
			if(cnt%2==0) {
				countEven++;
			}
			
			
			System.out.print(cnt);
			
			cnt =0;
		}
		
		System.out.println("\n"+countEven);
	}

}
