package day19_Stack;
import java.util.*;

public class Duplicate_parentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; //duplicate
                } else {
                    return false;
                }
            } else {
                // opening 
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)))"; // true
        String st2 = "(a-b)"; //false
        System.out.println(isDuplicate(str));
    }    
}
