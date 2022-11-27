import java.util.EnumSet;

public class insertion{
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1;  i < N; i++ ){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a,j,j-1);
            }
        }
    }

    public static void rsort(Comparable[] a){
        int N = a.length;
        for (int i = N-1; i > 0;i--){
            for (int j = i; j < N && less(a[j-1], a[j]);j++){
                exch(a, j-1, j);
            }
        }
    }
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] =t;
    }

    public static void show(Comparable[] a){
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }



}