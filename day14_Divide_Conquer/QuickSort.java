package day14_Divide_Conquer;
/*
Pivot and partition
    approach of Quick sorting
1. Pivot
    random, median, firstelement, lastelement
2. partition (parts)

4. to call Quick sort for my left side and call Quick sort for my right
    
*/
public class QuickSort {

    public static void printQuick(int quickArr[]){
        for(int i=0; i<quickArr.length; i++){
            System.out.print(quickArr[i] + " ");
        }    
        System.out.println();
    }

    
    public static void main(String[] args) {
        int quickArr[] = {6, 3, 9, 8, 2, 5};
    }
}
