import java.util.*;
import java.io.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        int arr[] = ReadingFile.readFiles(filename);
        int n = arr.length;
        Integer[] sarr = new Integer[n];
        
        System.out.println("Integers are reading from the " + filename + " file, the array is:");
        for(int i = 0; i < n; i++){
            sarr[i] = arr[i];
        }
        insertion.show(sarr);
  
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm");
        insertion.sort(sarr);
        insertion.show(sarr);

        System.out.println("Step 1 has been completed.");

        System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
        insertion.rsort(sarr);
        insertion.show(sarr);
        System.out.println("Step 2 has been completed.");

        System.out.println("Doubles are reading from the doubles.txt file, the array is:");



        sc.close();
    }
    
}
