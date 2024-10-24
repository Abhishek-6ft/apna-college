package day18_LinkedList;
import java.util.LinkedList;
public class frameworkofLinkedList {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> lil = new LinkedList<>();

        // add
        lil.addLast(1);
        lil.addLast(2);
        lil.addFirst(0);

        System.out.println(lil);

        //remove
        lil.removeLast();
        lil.removeFirst();
        System.out.println(lil);
    }
}

