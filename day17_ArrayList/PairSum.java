package day17_ArrayList;

import java.util.*;

public class PairSum {

    // brute force
    // public static boolean pairsum1(ArrayList<Integer> list, int target){
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i+1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // 2 Pointer Approach
    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        int leftPoint = 0;
        int rightPoint = list.size() - 1;
        while (leftPoint != rightPoint) {
            // case1
            if (list.get(leftPoint) + list.get(rightPoint) == target) {
                return true;
            }

            // case2
            if (list.get(leftPoint) + list.get(rightPoint) < target) {
                leftPoint++;
            } else {
                // case 3
                rightPoint--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairsum1(list, target));

    }
}
