package day21_Greedy;

import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 }; // sorted

        //sorting 
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lamda fucntion -> shortform of comparator
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted activity
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxActivity = 1;
        ans.add(0);
        int lastEnd = end[0];

        // select activity
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxActivity++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activites = " + maxActivity);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}

// Question
/*
 * You given n activites with their start and end times Select the maximum
 * number of activites that can be performed by a
 * single person, assuming that a person can only work on a single activity at a
 * time. Activites are sorted according to end time.
 * A0 A1 A2
 * start = [10, 20, 30]
 * 
 * end = [20, 25, 30]
 * 
 * ans = 2(a0 & a2)
 */
