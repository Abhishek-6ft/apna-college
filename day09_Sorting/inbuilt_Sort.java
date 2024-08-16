package day09_Sorting;
import java.util.*;


public class inbuilt_Sort {
    
    public static void Print(int count[]){
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();
    }

    // Counting Sort..

    public static void Counting_Sort(int count[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < count.length; i++) {
            largest = Math.max(largest, count[i]);
        }

        int counting_array[] = new int[largest+1];
        for(int i = 0; i < count.length; i++ ){
            counting_array[count[i]]++;
        }

        // sorting 
        int j = 0;
        for (int i = 0; i < counting_array.length; i++) {
            while (counting_array[i] > 0) {
                count[j] = i;
                j++;
                counting_array[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // Integer arrays[] = { 5, 6, 1, 4, 2, 3 };

        int count[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        Counting_Sort(count);
        // // Arrays.sort(arrays, 0, 3   );
        // Arrays.sort(arrays, 0, 3, Collections.reverseOrder());
        Print(count);
    }
}
