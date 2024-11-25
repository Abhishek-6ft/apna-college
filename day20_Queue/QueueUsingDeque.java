package day20_Queue;
import java.util.*;
import java.util.LinkedList;

// import day18_LinkedList.linklist;

public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> queue = new LinkedList<>();

        public void add(int data){
            queue.addLast(data);
        }

        public int remove(){
            return queue.removeFirst();
        }

        public int peek(){
            return queue.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(7);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Print peek of Queue using deque = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }    
}
