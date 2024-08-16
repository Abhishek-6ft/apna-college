package day02;

// import java.util.*;
// public class typeofconverstion {
//     // @SuppressWarnings("resource")
//     // public static void main(String args[]) {
//         // int a = 25;
//         // long b = a;
//         // long a = 25;
//         // int b = a; // THis converstion cannot done in java
//         // System.out.println(a);
//         // new example
//     //     Scanner sc = new Scanner(System.in);
//     //     float number = sc.nextInt();
//     //     System.out.println(number);
//     // }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float marks = 99.9999f;
//         int marks2 = (int) marks;
//         System.out.println(marks2);
//     }

// }



// byte -> short -> int -> float -> long -> double
// Widerning conversion
// implict conversion 

// type casting know as which value where we can forcefully change the data types

// type casting also known as narrowing and explicit

public class typeofconverstion {

    public static void main(String args[]){
        char ch = 'b';
        char ch2 = 'a';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);

    }
}