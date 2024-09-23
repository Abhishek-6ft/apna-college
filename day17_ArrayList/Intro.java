package day17_ArrayList;


import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        // Java Collection Framework
        // Syntax For Array Lists
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // Add Operation in Arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Get operation in ArrayLists
        // int element = list.get(2);
        // System.out.println(element);

        // Remove operation in ArrayLists
        // list.remove(2);
        // System.out.println(list);

        // Set element at index
        // list.set(2, 10);
        // System.out.println(list);

        // contain elment in Array Lists
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
