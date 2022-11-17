public class insertion {  
    public static void Sort(int[] array) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }
    } 
    
    public static void reverseSort(int[] array){

        for(int j = array.length - 2; j < 0;j--){
            int temp;
            int i = j+1;
            while((i < array.length ) && (array[i] > array[i-1])){
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i++;
            }
        }










    }
}