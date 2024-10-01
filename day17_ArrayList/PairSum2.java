package day17_ArrayList;
import java.util.*;

public class PairSum2 {
    
    public static boolean parisum2(ArrayList<Integer>  list, int target){
        // find the braking point
        int pivt = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) { // braking point
                pivt = i;
                break;
            }
        }

        int leftpoint = pivt+1; // smallest
        int rightpoint = pivt; // largest

        while (leftpoint != rightpoint) {
            // case 1
            if (list.get(leftpoint) + list.get(rightpoint) == target) {
                return true;
            }

            //case 2 
            if (list.get(leftpoint) + list.get(rightpoint) < target) {
                leftpoint = (leftpoint + 1) % n;
            } else{
                rightpoint = (n + rightpoint - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(parisum2(list, target));
    }
}
