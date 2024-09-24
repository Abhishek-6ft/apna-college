package day17_ArrayList;

import java.util.*;

public class ContainerWithMostWater_B {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        // brute forcce
        for(int i=0; i<height.size(); i++){
            for (int j = i+1; j < height.size(); j++) {
                int hght = Math.min(height.get(i), height.get(j));
                int width = j -1;
                int currwater = hght * width;
                maxWater = Math.max(maxWater, currwater);
            }
        }

        return maxWater;
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
        System.out.println(storeWater(height));
    }
}
