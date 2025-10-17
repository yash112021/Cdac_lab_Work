import java.util.*;
public class RowRev {
	// row revese code
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// declare the 2D array hard code data
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		displayarr(arr);
		int [][] arr2=revRow(arr,4);
		System.out.println("After row Reverse--->");
		
		displayarr(arr2);
		
		
		
	}
	
	// row reverse fucntion
	public static int [][] revRow(int[][] arr,int n){
		// login part of the array reverse
		
		//1 first create a temp array of the same size
		int temp[][]=new int[arr.length][arr[0].length];
		
		//2 now copying the data
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j] = arr[i][j];
			}
		}
		
		//3 now making the the 1d array to copy that data

		int []temp1d= new int [arr[0].length];
		temp1d= temp[0];  // adding the first row here
		
		
		//4 now moving the row upside
		for(int i=0;i<temp.length-1;i++) {
			temp[i]=temp[i+1];
		}
		
		//5 now adding the data into the last row
		temp[temp.length-1]=temp1d;
		
		return temp;
		
	}
	
	// display the array
	public static void displayarr(int[][] arr){
		System.out.println("\n Dsiplay array \n***************");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	
	

}
