package day15_Time_Complexity;

import java.util.Arrays;

public class binarySearch {
    public static int Bsearch(int arrays[], int keyy){
        int st = 0;
        int lst = arrays.length-1;
        while (st <= lst) {
            int middlee = (lst + st) / 2;
            if (arrays[middlee] == keyy) {
                return middlee;
            }else if (arrays[middlee] < keyy) {
                st = middlee + 1;
            } else{
                lst = middlee - 1;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int arrays[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int keyy = 5;
        System.out.print(Bsearch(arrays, keyy));
    }
}
