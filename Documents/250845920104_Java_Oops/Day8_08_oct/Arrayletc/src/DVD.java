import java.security.DomainCombiner;

//public class DVD {
//
//}// The actual code for creating an Array to hold DVD's.
//datatype is dvd and arrname is dvdcollection


//A simple definition for a DVD.
public class DVD {
 public String name;
 public int releaseYear;
 public String director;

 public DVD(String name, int releaseYear, String director) {
     this.name = name;
     this.releaseYear = releaseYear;
     this.director = director;
 }

 public String toString() {
     return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
 }
 
// so when comment the to string method we will get not proper data so we need to string method to display the data
 
 //main method
 public static void main(String[] args) {
	 
	 DVD[] cd = new DVD [15];  //declraing the array of class with size 15
	 DVD a = new DVD ("Pushpa",2022, "Sunil shetty");
	 
	 
	 //Now in the at particular location we are going to store the data
	 
	 cd[2]=a;  // array second locaton storing the data
	 
	 
	// now we are going to create more object and store them
	 DVD b,c,d,e,f;
	 b=new DVD("xyz",2025,"abhisehk");
	 c=new DVD("xyz",2025,"yash");
	 d=new DVD("xyz",2025,"nayan");
	 e=new DVD("xyz",2025,"Sandesh");
	 f=new DVD("xyz",2025,"divya");

	 // now adding the objects in that array
	 
	 
	 cd[3]=b;
	 cd[4]=c;
	 cd[5]=d;
	 cd[6]=e;
	 cd[9]=f;
	 
	 
	 
	 // now by using the for loop we are going to print the array
	 for(int i=0;i<cd.length;i++) {
		 System.out.println(i+" index -->"+cd[i]);
	 }
	 
	 // now trying to overwrite the data
	 cd[9]=new DVD("kbc",2004,"anuj");
	 
	 System.out.println("************************");
	 
	 // now by using the for loop we are going to print the array
	 for(int i=0;i<cd.length;i++) {
		 System.out.println(i+" index -->"+cd[i]);
	 }
	 // now the divya cd[9] has being overwritten by the anuj
	 
	 
	 // now what we are going to do is create an array that will have the square roots
	 
	 // array create
	 int []squr=new int[15];
	 
	 // for loop for taking the input
	 for(int i=0;i<squr.length;i++) {
		 squr[i] = ((i+1)*(i+1));
		 
	 }
	 
	 System.out.println("printing the square and by the help of the array -->");
	 // loop for priting
//	 for(int i=0;i<squr.length;i++) {
//		 System.out.println(squr[i]);
//	 }
	 
	 
	 // now using the forEachloop for printing purpose
	 for(int  x:squr) {
		 System.out.println(x);
	 }
	 
	 // now we are going to check the the array capcity
	 
	 
	 int capacity=squr.length;
	 System.out.println("The capacity is of the sqare array is --> "+capacity);
	 
	 
	 // now we are going to create a array and then track is length and the capcity
	 
	 // now we are having an array whose capacity is 6 
	 
	 int yash[]=new int[6];
	 
	 int len=0;
	 
	 // here we  are going to fill only the 3 index
	 for(int i=0;i<3;i++) {
		 yash[i]=20;
		len++;
	 }
	 
	 // now printing the length and the capacity
	 for(int p:yash) {
		 System.out.println(p);
	 }
	 
	 System.out.println("the length is -->"+len);
	 System.out.println("The capcacity of the array is -->"+yash.length);
	 
	 
	 // now what we are going to create a array of length 6 and then and then fill the data in hallf array and track it by variable
//	 and then add last where we stoped and print the array
	 
	 
	 int [] yash1=new int[6];
	 
	 int length=0;
	 
	 for(int i=1;i<=3;i++) {
		 yash1[length]=i;
		 length++;
	 }
	 
	 // printing the full array
	 for(int i=0;i<yash1.length;i++) {
		 System.out.println(i+" --> "+yash1[i]);
	 }
	 
	 System.out.println("Now adding the element at the end with the help of the length\n **************");
	 
	yash1[length]=112021032;  // adding data at the last index
	
	
	 for(int i=0;i<yash1.length;i++) {
		 System.out.println(i+" --> "+yash1[i]);
	 }
	 
	 System.out.println("Now we are going to add the element at the first index and then  move Elements towards right");
	 
	 
	 // reverse for loop
	 for(int i=3;i>=0;i--) {
		 yash1[i+1]=yash1[i]; // moving one one elements forward
	 }
	 
	 // blank space at first index
	 System.out.println("blank space at first index");
	 for(int i=0;i<yash1.length;i++) {
		 System.out.println(i+" --> "+yash1[i]);
	 }
	 
	 yash1[0]=1000;  // adding data at the first index;
	 System.out.println("blank space at first index filled \n*************************");
	 // now using loop to show
	 for(int i=0;i<yash1.length;i++) {
		 System.out.println(i+" --> "+yash1[i]);
	 }
	 
	 
	 
	 
	
 }
}














