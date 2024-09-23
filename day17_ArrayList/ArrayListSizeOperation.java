package day17_ArrayList;

import java.util.ArrayList;
public class ArrayListSizeOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print Reverse array
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // System.out.println(list.size());

        // print the arraylists
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
    }
}
