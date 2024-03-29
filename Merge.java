public class Merge {
    private static Comparable[] aux;
    
    private static void merge(Comparable[] a, int lo, int mid, int hi) { 
        for (int i = lo; i <= mid; i++)
           aux[i] = a[i]; 
        
        for (int j = mid+1; j <= hi; j++)
           aux[j] = a[hi-j+mid+1];
       
        int i = lo, j = hi; 
        for (int k = lo; k <= hi; k++) 
           if (less(aux[i], aux[j])) a[k] = aux[j--];
           else                      a[k] = aux[i++];
     } 
    

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
        }

    private static void sort(Comparable[] a, int lo , int hi){
        if(hi <= lo) return;
        int mid = lo + (hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
}
