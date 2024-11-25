package day20_Queue;

import java.util.*;
import java.util.LinkedList;

public class FIrstNonRepeating {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // track character 'a' - 'z'
        Queue<Character> q = new LinkedList<>(); // for track the frequency of character in freq[]

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aashisz";
        printNonRepeating(str);
    }
}
