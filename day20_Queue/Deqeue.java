package day20_Queue;
import java.util.*;
import java.util.LinkedList;

public class Deqeue {   // Deque (D Double E Ended Que Queue)
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        

        // Deque<Integer> deque = new LinkedList<>();
        // deque.addFirst(1); //1
        // deque.addFirst(2); //2 1
        // deque.addLast(3); // 2 1 3
        // deque.addLast(4); // 2 1 3 4 
        // System.out.println(deque);
        // deque.removeFirst();
        // // deque.removeLast();
        // System.out.println(deque.getFirst());
    }    
}
