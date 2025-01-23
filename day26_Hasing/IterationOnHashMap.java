package day26_Hasing;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("Nepal", 50);
        hm.put("China", 130);
        hm.put("Bangladesh", 60);
        hm.put("Russia", 160);
        hm.put("America", 190);

        // System.out.println(hm);
        System.out.println(hm.entrySet());

        // for iteration we use Set class and keyset function of hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // for value we iterate using for each loop
        for (String k : keys) {
            System.out.println("Keys: " + k + ", " + "value=" + hm.get(k));
        }


    }
}
