package day17_ArrayList;

import java.util.*;

public class PointerApproach {

    public static int mostStoreWater(ArrayList<Integer> height) {
        int maximumWater = 0;
        int leftPointer = 0;
        int rightPointer = height.size() - 1;
        while (leftPointer < rightPointer) {
            // calculate water area
            int heightofTank = Math.min(height.get(leftPointer), height.get(rightPointer));
            int widthOfTank = rightPointer - leftPointer;
            int currentWater = heightofTank * widthOfTank;
            maximumWater = Math.max(maximumWater, currentWater);

            // update pointer
            if (height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }

        }
        return maximumWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(mostStoreWater(height));
    }
}
