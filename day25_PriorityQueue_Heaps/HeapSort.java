package day25_PriorityQueue_Heaps;

public class HeapSort {

    // public static void heapify(int arr[], int i, int size) {
    //     int left = 2 * i + 1;
    //     int right = 2 * i + 2;
    //     int maxIndex = i;

    //     if (left < size && arr[left] > arr[maxIndex]) {
    //         maxIndex = left;
    //     }

    //     if (right < size && arr[right] > arr[maxIndex]) {
    //         maxIndex = right;
    //     }

    //     if (maxIndex != i) {
    //         // swaap
    //         int temp = arr[i];
    //         arr[i] = arr[maxIndex];
    //         arr[maxIndex] = temp;

    //         heapify(arr, maxIndex, size);
    //     }
    // }
    //min heap
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIndex = i;

        if (left < size && arr[left] < arr[minIndex]) {
            minIndex = left;
        }

        if (right < size && arr[right] < arr[minIndex]) {
            minIndex = right;
        }

        if (minIndex != i) {
            // swaap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            heapify(arr, minIndex, size);
        }
    }
    public static void heapsort(int arr[]) {
        // step 1 build maxheap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);   // O(n*logn)
        }
        // step 2 to push largest at end

        for (int i = n - 1; i > 0; i--) {
            // swap largest elment first with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i); //O(n*logn)
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        heapsort(arr);

        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
       System.out.println();
    }
}
