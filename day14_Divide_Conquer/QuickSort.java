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

    public static void quickSort(int quickArr[], int sindex, int eindex){
        if (sindex>=eindex) {
            return;
        }
        // pivot find out last element
        int pivotIndex = partition(quickArr, sindex, eindex);
        quickSort(quickArr, sindex, pivotIndex-1);
        quickSort(quickArr, pivotIndex+1, eindex);

    }
    public static int partition(int quickArr[], int sindex, int eindex){
        int pivot = quickArr[eindex];
        int i = sindex-1; // to make place for els smaller than pivot

        for(int j=sindex; j<eindex; j++){
            if (quickArr[j] <= pivot) {
                i++;
                //swap
                int temp = quickArr[j];
                quickArr[j] = quickArr[i];
                quickArr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        quickArr[eindex] = quickArr[i];
        quickArr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int quickArr[] = {6, 3, 9, 8, 2, 5, -5};
        quickSort(quickArr, 0, quickArr.length-1);
        printQuick(quickArr);
    }
}
