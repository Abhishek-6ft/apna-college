package day14_Divide_Conquer;

public class mergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSortt(int arr[], int startingIndex, int endingIndex){
        if (startingIndex >= endingIndex) {
            return;
        }

        // kaam
        int mid = startingIndex + (endingIndex - startingIndex) / 2;
        mergeSortt(arr, startingIndex, mid); // left part
        mergeSortt(arr, mid+1, endingIndex); // right part

        merge(arr, startingIndex, mid, endingIndex);
    }

    public static void merge(int arr[], int startingIndex, int mid, int endingIndex){
        int temp[] = new int[endingIndex - startingIndex +1];
        int i = startingIndex; // iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0;// iterator for temp array
        
        while (i <= mid && j <= endingIndex) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }
        // left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right
        while (j <= endingIndex) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k=0, i=startingIndex; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSortt(arr, 0, arr.length-1);
    }
}
