import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();

        Scanner inFile = new Scanner(new File(filename));
        int size = inFile.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inFile.nextInt();
        }

        System.out.println("Integers are reading from the " + filename + " file, the array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        
       
        insertion.Sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertion.reverseSort(arr);

        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        scanner.close();
    }
}
