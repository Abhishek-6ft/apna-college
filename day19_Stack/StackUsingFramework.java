package day19_Stack;
import java.util.*;
public class StackUsingFramework {
    
    public static void main(String[] args) {
        // Stack sack = new Stack();
        Stack<Integer> sack = new Stack<>();
        sack.push(1);
        sack.push(2);
        sack.push(3);

        while (!sack.isEmpty()) {
            System.out.println(sack.peek());
            sack.pop();
        }
    }
}
