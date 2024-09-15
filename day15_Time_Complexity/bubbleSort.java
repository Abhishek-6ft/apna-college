package day15_Time_Complexity;

public class bubbleSort {
    // public static void bubbleSorting(int arr[]){
    //     for (int turn = 0; turn < arr.length-1; turn++) {
    //         for (int j = 0; j < arr.length-1-turn; j++) {
    //             if (arr[j] > arr[j+1]) {
    //                 // swaping
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    // Optimized bubble sort
    public static void optimizedBubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            boolean swapped = false;
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
    public static void arrayPrint(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        // bubbleSorting(arr);
        optimizedBubbleSort(arr);
        arrayPrint(arr);
    }
}
