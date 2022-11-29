import java.util.*;
import java.util.concurrent.*;
public class quick {

    static void shuffleArray(Comparable[] ar){
    Random rnd = ThreadLocalRandom.current();
    
    for (int i = ar.length - 1; i > 0; i--){
      int index = rnd.nextInt(i + 1);
      Comparable a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
     }
    }

    public static void sort(Comparable[]a){
        shuffleArray(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[]a , int lo , int hi){
        if (hi <= lo) return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[]a ,int lo, int hi){
        int i = lo;
        int j = hi+1;
        Comparable v = a[lo];
        while (true){
            while(less(a[++i],v)){
                if(i == hi) break;
            }
            while(less(v,a[--j])){
                if(j == lo) break;
            }
            if(i >= j){
                break;
            }
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] =t;
    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void rshow(Route[] a){
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i]);
        }
    }

}