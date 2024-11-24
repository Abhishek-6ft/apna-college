package day20_Queue;
import java.util.*;
import java.util.LinkedList;


public class QueueUsingJCFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
