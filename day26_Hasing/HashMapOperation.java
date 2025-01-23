package day26_Hasing;
import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args) {
        //Create hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert in hashmap
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("Neapl", 25);
        hm.put("US", 55);

        System.out.println(hm);

        //get operation help to get the value of key
        int population = hm.get("China");
        System.out.println("India population = " + hm.get("India"));
        System.out.println("Pakistan population = " +hm.get("Pakistan"));
        System.out.println("China population = " +population);

        //containsKey operation this operation return true or false value ok key contain in map
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pakistan"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.size());
        //Remove

        hm.remove("China");
        hm.remove("US");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is clear
        hm.clear();
        //is Empty
        System.out.println(hm.isEmpty());

    }
}
