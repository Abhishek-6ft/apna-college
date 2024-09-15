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
        int arrays[] = {8, 9, 5, 6, 1, 2, 7, 0, 3, 4};
        Arrays.sort(arrays);
        int keyy = 88;
        System.out.print(Bsearch(arrays, keyy));
    }
}
