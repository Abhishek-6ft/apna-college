package day08_Array;

public class Binary_Search {
    // Binary Search prerequisite sorted array

    public static int binary(int elment[], int key) {
        int start = 0, End = elment.length - 1;
        while (start <= End) {
            int mid = (start + End) / 2;

            // comparison

            if (elment[mid] == key) {
                return mid;
            }
            if (elment[mid] < key) // right wali
            {
                start = mid + 1;
            } else {// left
                End = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int elment[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 14;

        System.out.println("Index for key is : " + binary(elment, key));
    }
}