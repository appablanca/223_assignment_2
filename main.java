import java.util.*;
import java.io.*;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String filename = sc.next();
        int arr[] = ReadingFile.readFiles("integers.txt");
        int n = arr.length;
        Integer[] sarr = new Integer[n];
        for(int i = 0; i < n; i++){
            sarr[i] = arr[i];
        }
        System.out.println("Integers are reading from the " + "filename" + " file, the array is:");
       
        insertion.show(sarr);
        Integer sarr3[] = new Integer[n];
        for(int i = 0; i < n; i++){
            sarr3[i] = arr[i];
        }
  
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
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
        double arr2[] = ReadingFile.readFilesD("doubles.txt");
        int n2 = arr2.length;
        Double[] sarr2 = new Double[n2];
        for(int i = 0; i < n2; i++){
            sarr2[i] = arr2[i];
        }
        insertion.show(sarr2);
        System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");
        insertion.sort(sarr2);
        insertion.show(sarr2);
        System.out.println("Step 3 has been completed.");
        System.out.println("");

        System.out.println("The original array is:");
        insertion.show(sarr3);
        System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
        Merge.sort(sarr3);
        insertion.show(sarr3);
        System.out.println("Step 4 has been completed.");
        System.out.println("");

       
        Integer sarr4[] = new Integer[n];
        for(int i = 0; i < n; i++){
            sarr4[i] = arr[i];
        }
        quick.sort(sarr4);
        insertion.show(sarr4);

        Route r0 = new Route("Ankara", "Istanbul");
        Route r1 = new Route("Ankara", "Izmir");
        Route r2 = new Route("Ankara", "Antalya");
        Route r3 = new Route("Istanbul", "Ankara");
        Route r4 = new Route("Istanbul", "Izmir");
        Route r5 = new Route("Istanbul", "Antalya");
        Route r6 = new Route("Antalya", "Ankara");
        Route r7 = new Route("Antalya","Istanbul");
        Route r8 = new Route("Izmir", "Ankara");
        Route r9 = new Route("Izmir","Istanbul");
        Route[] rsarr = new Route[10];
        rsarr[0] = r0;
        rsarr[1] = r1;
        rsarr[2] = r2;
        rsarr[3] = r3;
        rsarr[4] = r4;
        rsarr[5] = r5;
        rsarr[6] = r6;
        rsarr[7] = r7;
        rsarr[8] = r8;
        rsarr[9] = r9;
        quick.sort(rsarr);
        quick.rshow(rsarr);
        System.out.println("Step 6 has been completed.");



        
        sc.close();
    }
    
}