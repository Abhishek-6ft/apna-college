package day21_Greedy;
import java.util.*;


public class WIthoutSortingselection {
    
    public static void main(String[] args) {
        int starting[] = {1, 3, 0, 5, 8, 5};
        int ending[] = {2, 4, 6, 7, 9, 9};

        // sorting
        int activitiy[][] = new int[starting.length][3];
        for(int i=0; i<starting.length; i++){
            activitiy[i][0] = i;
            activitiy[i][1] = starting[i];
            activitiy[i][2] = ending[i];
        }

        //lambda function
        Arrays.sort(activitiy, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        //1st activity
        maxAct = 1;
        answer.add(activitiy[0][0]);
        int lastEnding = activitiy[0][2];

        //select activity
        for(int i=0; i<ending.length; i++){
            if (activitiy[i][1] >= lastEnding) {
                maxAct++;
                answer.add(activitiy[i][0]);
                lastEnding = activitiy[i][2];
            }
        }

        System.out.println("Max activites = " + maxAct);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print("A" + answer.get(i) + " ");
        }
        System.out.println();
    }
}
