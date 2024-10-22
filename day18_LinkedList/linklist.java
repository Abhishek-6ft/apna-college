package day18_LinkedList;
// import java.util.*;

public class linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // methods for linkedlist

    public void addFirst(int data) {
        // Step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 - newNode next = head
        newNode.next = head;

        // Step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 = create new node for last element
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data; // prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // search in linked list by iterative
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // search in linked list by recursive
    // Search for a key in linked list. Return the position where it is found if not
    // found, return -1. Use Recursrion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Reverse a Linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove nth From end on Linked List

    public void deleteNthFromEnd(int n) {
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int itofind = sz - n;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Check if LL is palimdrome
    public Node findMid(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // slow +1
            fast = fast.next.next; // fast +2
        }
        return slow; // slow in midvalue of linked list
    }

    public boolean checkifPalidrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 find mid linked list 
        Node midNode = findMid(head);

        // step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half hand
        Node left = head;

        // step 3 check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    // detect is Cycle/loop exist in linked list
    public static boolean isLoop(){ // this algorithm know as Floy's cycle finding algorithm 
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // loop exist in linked list 
            }
        }
        return false; 
    }

    // Remove cycle/loop from linked list
    public static void removeCycle(){

        // Detct its cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        
        // find the meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle
        prev.next = null;
    }


    public static void main(String[] args) {

        // make linked list for loop/cycle in linked list
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isLoop());
        removeCycle();
        System.out.println(isLoop());
        
        // linklist ll = new linklist();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        
        // ll.print();
        // System.out.println(ll.checkifPalidrome());
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.itrSearch(15));

        // System.out.println(ll.recursiveSearch(4));
        // System.out.println(ll.recursiveSearch(22));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.print();
    }
}
