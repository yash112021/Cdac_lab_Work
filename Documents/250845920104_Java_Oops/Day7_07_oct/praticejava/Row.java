// now trying the row  rotation in the java
import java.util.*;
public class Row{
    public static void main(String args[]){
        // taking the hardcode 2d array
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        //printing the array
        System.out.println("printing the array");
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        } 



    }
}