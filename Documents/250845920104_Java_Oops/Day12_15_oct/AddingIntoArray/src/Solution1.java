
public class Solution1 {

	public static void main(String[] args) {
		int[] arr= {1,0,2,3,0,4,5,0};
		int [] yash=duplicateZeros(arr);
		
		// printing the  array
		for(int i=0;i<yash.length;i++) {
			System.out.print(yash[i]);
		}
		System.out.println();

	}
	
	
	public static int [] duplicateZeros(int[] arr) {
        // first traversing the aray
        for(int i=0;i<arr.length;i++){
            // if zero occurs then shifting the element towards right 
            if(arr[i]==0){
                // loop for shifing towards right
                for(int j=arr.length-2;j>arr[i+1];j--){
                    // if(arr[j+1]>arr.length){ break ;}
                    arr[j+1]=arr[j];
//                    arr[j]=-1;
                }
                // after shifting adding the value
                arr[i+1]=-1;
                 i++;
            }
           
        }
        return arr;
    }
	
	
	

}
