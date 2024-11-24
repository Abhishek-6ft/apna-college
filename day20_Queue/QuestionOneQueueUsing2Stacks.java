package day20_Queue;

import java.util.*;

public class QuestionOneQueueUsing2Stacks {

    static class Queue {
        // Create two stack using jcf for problem
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int data) {
            // First step to push data to s2 from s1
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // Second step to push all data in s1
            s1.push(data);

            // Third step to move element from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove function

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek function

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty not any thing to peek");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
