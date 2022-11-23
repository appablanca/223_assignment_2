import java.util.*;
import java.io.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        int arr[] = ReadingFile.readFiles(filename);
        int n = arr.length;
        Integer[] sarr = new Integer[n];
        for(int i = 0; i < n; i++){
            sarr[i] = arr[i];
        }
        System.out.println("Integers are reading from the " + filename + " file, the array is:");
       
        insertion.show(sarr);
  
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm");
        insertion.sort(sarr);
        insertion.show(sarr);

        System.out.println("Step 1 has been completed.");
        System.out.println("");

        System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
        insertion.rsort(sarr);
        insertion.show(sarr);
        System.out.println("Step 2 has been completed.");
        System.out.println("");

        System.out.println("Doubles are reading from the doubles.txt file, the array is:");
        int arr2[] = ReadingFile.readFiles("doubles.txt");
        int n2 = arr2.length;
        Integer[] sarr2 = new Integer[n2];
        for(int i = 0; i < n; i++){
            sarr2[i] = arr2[i];
        }
        insertion.show(sarr2);


        sc.close();
    }
    
}
