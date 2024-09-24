package day17_ArrayList;
import java.util.*;

public class Multi_DimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4); list2.add(5); list2.add(6);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0; j<currentList.size(); j++){
                System.out.print(currentList.get(j) + " ");
            }
        }
        System.out.println(mainList);
    }
}
