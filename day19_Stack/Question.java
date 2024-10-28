package day19_Stack;
import java.util.*;
public class Question {

    // Question 1 Push at the Bottom of the Stack Using recursion for this question
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Question 2 Reverse a String using Stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while (indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    // Question 3 
    // Reverse a Stack

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {

        //Create new Stack for reverse a Stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);x
        reverseStack(s);
        printStack(s);

        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4); // this function call for add 4 at bottom of stack 
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        String str = "Oo lala Oo lala";
        String result = reverseString(str);
        System.out.println(result);
    }
}
