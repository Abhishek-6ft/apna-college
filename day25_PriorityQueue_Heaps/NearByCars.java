package day25_PriorityQueue_Heaps;

import java.util.PriorityQueue;

public class NearByCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;
        int indx;

        public Point(int x, int y, int distsq, int indx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.indx = indx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distsq - p2.distsq; // sorting in ascending order
        }
    }

    public static void main(String[] args) {
        int pointers[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pointers.length; i++) {
            int distsq = pointers[i][0] * pointers[i][0] + pointers[i][1] * pointers[i][1];
            pq.add(new Point(pointers[i][0], pointers[i][1], distsq, i));
        }

        // near car
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().indx);
        }
    }
}
