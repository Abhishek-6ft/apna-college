package day25_PriorityQueue_Heaps;

import java.util.*;

public class InsertInHeap {

    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
        arr.add(data);

        int x = arr.size() - 1; // child index
        int par = (x - 1) / 2; // parents index

        while (arr.get(x) > arr.get(par)) { // O(logn)
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

            x = par;
            par = (x-1) / 2;
        }
    }

    public int peek() {
        return arr.get(0);
    }

    //heapify function
    private void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndx = i;
        if (left < arr.size() && arr.get(maxIndx) < arr.get(left)) {
            maxIndx = left;
        }
        if (right < arr.size() && arr.get(maxIndx) < arr.get(maxIndx)) {
            maxIndx = right;
        }

        if (maxIndx != i) {
            // swaap
            int temp = arr.get(i);
            arr.set(i, arr.get(maxIndx));
            arr.set(maxIndx, temp);

            heapify(maxIndx);
        }
    }

    // remove function
    public int remove() {
        int data = arr.get(0);

        // swap 1 first $ last
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // step 2 delete last
        arr.remove(arr.size() - 1);

        // step 3 - heapify
        heapify(0);
        return data;
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }
    public static void main(String[] args) {
        InsertInHeap pq = new InsertInHeap();
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
