package day10_String;
import java.util.*;
public class Strg {


    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

    //    char arr[] = {'a','b','c','d'};
    //    String str = new String("Hello World");
 
    //      System.out.println(str);
    //      String are IMMUTABLE
    //      Scanner sc = new Scanner(System.in);
    //      String name;
    //      name = sc.nextLine();
    //      System.out.println(name); 
       
        // String fullname = "abhishek singh";
        // System.out.println(fullname.length());

        //Concatenation
        String FirstName = "123456";
        String Lastname = "Singh";
        String fullname = FirstName + " " + Lastname;
        // System.out.println(fullname.charAt(0));


        printletter(fullname);
    }
};