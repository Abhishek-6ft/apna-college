package day21_Greedy;
import java.util.*;

public class ChocolaProblem {
    
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVertical[] = {2, 1, 3, 1, 4};
        Integer costHorizontal[] = {4, 1, 2}; 

        Arrays.sort(costVertical, Collections.reverseOrder());
        Arrays.sort(costHorizontal, Collections.reverseOrder());

        int h = 0, v = 0; // which cut use horizontal or vertical
        int hpice = 1, vpice = 1; 
        int cost = 0;

        while(h < costHorizontal.length && v < costVertical.length){
            // case 1 vertical cost < horizontal cost
            if (costVertical[v] <= costHorizontal[h]) { // here we use horizontal cut because horizontal cut is higher
                cost += (costHorizontal[h] * vpice);
                hpice++;
                h++; 
            } else { //vertically
                cost += (costVertical[v] * hpice);
                vpice++;
                v++;
            }
        }

        // if my horizontal cut remain
        while(h < costHorizontal.length){
            cost += (costHorizontal[h] * vpice);
            hpice++;
            h++;
        }
        // if my vertical cut remain
        while(v < costVertical.length){
            cost += (costVertical[v] * hpice);
            vpice++;
            v++;
        }


        System.out.println("Minimum cost of cuts = " + cost);
    }
}
