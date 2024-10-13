package day18_LinkedList;
// import java.util.*;

public class linklist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data  = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // methods for linkedlist
    
    public void addFirst(int data){
        // Step1 = create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 - newNode next = head
        newNode.next = head;

        //Step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step 1 = create new node for last element
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void print(){
        if (head == null) {
            System.out.println("ll is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.addFirst(2); 
        ll.addLast(3); 
        ll.addFirst(1); 
        ll.addLast(4);
        ll.add(0, 9);
        ll.print(); 
    }
}
