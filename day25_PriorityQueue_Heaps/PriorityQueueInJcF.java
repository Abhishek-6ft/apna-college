package day25_PriorityQueue_Heaps;
import java.util.*;


public class PriorityQueueInJcF {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
        
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Abhishek", 15));
        pq.add(new Student("Raju", 21));
        pq.add(new Student("Parbhat", 20));
        pq.add(new Student("Priyanshu", 19));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
