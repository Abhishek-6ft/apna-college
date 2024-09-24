package day17_ArrayList;

// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class QuestionInArrayLists {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx2);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Question 3 Sorting an ArrayList
        // System.out.println(list);
        // Collections.sort(list); // ascending
        // System.out.println(list);

        //descending sort
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);        

        // Question 2 Swap 2 Numbers index : inx 1 = 1, inx 2 = 3;
        // int indx1 = 1 , indx2 = 3;
        // System.out.println(list);
        // swap(list, indx1, indx2);
        // System.out.println(list);


        //Question 1  maximum in arraylist
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            // max = Math.max(max, list.get(i));
        // }

        // System.out.println("Max element = " + max);
    }
}
