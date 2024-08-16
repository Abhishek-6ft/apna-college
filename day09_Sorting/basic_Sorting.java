package day09_Sorting;

public class basic_Sorting {

    // public static void bubble_sort(int arr[]) {
    // for (int turn = 0; turn < arr.length-1; turn++) {
    // for (int j = 0; j < arr.length-1-turn; j++) {
    // if (arr[j] > arr[j + 1]) {
    // //swap
    // int temp = arr[j];
    // arr[j] = arr[ j + 1];
    // arr[j+1] = temp;
    // }
    // }
    // }
    // }

    
    // Selection sorting

    // public static void Selection_Sort(int arr[]) {

    // for (int i = 0; i < arr.length - 1; i++) {
    // int MinPos = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[MinPos] < arr[j]) {
    // MinPos = j;
    // }
    // }

    // // swap
    // int temp = arr[MinPos];
    // arr[MinPos] = arr[i];
    // arr[i] = temp;
    // }
    // }

    

    // Insertion_Sort

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int Current = arr[i];
            int Previous = i - 1;
            // finding out the correct position for insert
            while (Previous >= 0 && arr[Previous] > Current) {
                arr[Previous + 1] = arr[Previous];
                Previous--;
            }
            // insertion
            arr[Previous + 1] = Current;

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // Selection_Sort(arr);
        // bubble_sort(arr);
        insertion_sort(arr);
        printArr(arr);
    }
}