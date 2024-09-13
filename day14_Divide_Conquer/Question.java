package day14_Divide_Conquer;
// Search in Rotated Sorted arryyyyyyyyay
// input: sorted, rotated array with distinct numbers (in ascending order) it is rotated at a pivot point. Find the index
// of given element.
// ex- arr[] = {4, 5, 6, 7, 0, 1, 2};
// target == 0, output : 4 
public class Question {
    public static int search(int arry[], int target, int strtindx, int endindx){
        // base case
        if (strtindx > endindx) {
            return -1;
        }
        // kaam
        int middle = strtindx + (endindx - strtindx)/2;

        //case found
        if (arry[middle] == target) {
            return middle;
        }

        // middle lie on l1
        if (arry[strtindx] <= arry[middle]) {
            // case a "left"
            if (arry[strtindx] <= target && target <= arry[middle]) {
                return search(arry, target, strtindx, middle-1);
            } else{
                // case b right
                return search(arry, target, middle+1, endindx);
            }
        }
        // middle lie on l2
        else{
            // case c right
            if (arry[middle] <= target && target <= arry[endindx]) {
                return search(arry, target, middle+1, endindx);
            } else{
                return search(arry, target, strtindx, middle-1);
            }
        }

    }
    public static void main(String[] args) {
        int arry[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6; // output index 4
        int targetIndex = search(arry, target, 0, arry.length-1);
        System.out.println(targetIndex);
    }
}
