import java.util.*;
public class Java_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// trying the different string functions
		
		String str1="Bored_life";
		System.out.println("string used-->"+str1);
		// 1 indexOf(function)
		System.out.println("by using the indexOF "+str1.indexOf("life"));
		// 2 toLowerCase
		System.out.println("toLowerCase "+str1.toLowerCase());
		// 3 toUpperCase
		System.out.println("toUpperCase "+str1.toUpperCase());
		// 4 contains Substring
		System.out.println("whether it contain the substring-->yash "+str1.contains("yash"));
		System.out.println("whether it contain the substring-->life "+str1.contains("life"));

		// 5 spliting the string now in these conditon we are requring the delimeter 
//		form we want to separat it now in the below string to split it 
		String s2="xxx,yyy,aaa-bbb";
		System.out.println("using the split one--> "+s2.split(s2, ','));
		
		
		// 6startwith 7//endswith
		String ya="Happylife";
		System.out.println("string used-->"+ya);

		System.out.println("now using using the inbuilt starts width-->"+ya.startsWith("Ha"));
		System.out.println("now using using the inbuilt starts width-->"+ya.startsWith("ha"));
		
		//endswith
		System.out.println("now using using the inbuilt ends width-->"+ya.startsWith("fe"));
		System.out.println("now using using the inbuilt ends width-->"+ya.startsWith("ef"));
		
		//8 finding at particular index
		
		System.out.println("find at using by using charAt funct finding at index 2-->"+ya.charAt(2));
		
		
		
		
		
		
		
	}

}
