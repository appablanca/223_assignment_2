
import java.io.*;
import java.util.*;

public class ReadingFile {
	public static int[] readFiles(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while(s.hasNextInt())
			{
				n++;
				s.nextInt();
			}
			int S[] = new int[n];

			Scanner s1 = new Scanner(f);

			for(int i =0; i < S.length; i++)
				S[i] = s1.nextInt();

			return S;
			

		}
		catch(Exception e) {
			return null;
		}
	}
	public static void printArray(Integer[] arr)

	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
			
	}

	public static double[] readFilesD(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while(s.hasNextDouble())
			{
				n++;
				s.nextDouble();
			}
			double S[] = new double[n];

			Scanner s1 = new Scanner(f);

			for(int i =0; i < S.length; i++)
				S[i] = s1.nextDouble();

			return S;
			

		}
		catch(Exception e) {
			return null;
		}
	}
	
	
}
	
