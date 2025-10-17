
public class AddAtfirstIndex {

	public static void main(String[] args) {
		
		//Adding at the first index 
		int arr []=  new int[6];
		arr[0] =2;
		arr[1] =3;
		arr[2] =4;
		arr[3] =6;
		arr[4]=5;
		arr[5]=7;
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+" index :- "+arr[i]);
		}		
		 
		for(int i=5;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		System.out.println("***********************************");
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+" index :- "+arr[i]);
		}		
		
		
		arr[0] = 100;
		System.out.println("***********************************");
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+" index :- "+arr[i]);
		}	

	}

}
