
public class AddAtlast {

	public static void main(String[] args) {
		//adding into array at last
		int arr[] = new int[10];
		
		int ab = 0;
		
		for(int i=101; i<=105;i++) {
			arr[ab] = i;
			ab++;
		}
		
		arr[ab]=112021032;
		ab++;
		arr[ab]=5556;
		
		
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);

		}
		
	}

}
