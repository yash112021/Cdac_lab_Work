
public class Addatanywhere {

	public static void main(String[] args) {
	//adding elements at any index
		
		int a [] = new int[6];
		
		a[0] =1;
		a[1] =2;
		a[2] =3;    ///insert at this index
		a[3] =14;
		a[4] =15;
		//print array
		for(int i=0; i<a.length;i++) {
			System.out.println(i+" index : "+a[i]);
		}
		
		
		//for shifting the elements toward right
		for(int i=4;i>=2;i--) {
			a[i+1]=a[i];
		}
		//now entering the data at the given index
		a[2] = 10;
		
		
		// loop for printing the arra
		System.out.println("***********************************");
		for(int i=0; i<a.length;i++) {
			System.out.println(i+" index : "+a[i]);
		}

	}

}
