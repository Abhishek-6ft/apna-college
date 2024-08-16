package day04_Loops;

import java.util.Scanner;

public class practiceset {
    @SuppressWarnings("resource")
    public static void main(String args[]){

        // Question 1 how many hello print

        // for (int i = 0; i < 6; i++) {
        //     System.out.println("hello");
        //     i+=2;
        // }


        // factorial

            Scanner sc =  new Scanner(System.in);
            int num;
            int fact= 1;
            System.out.println(" Enter any positive integer: ");
             num  = sc.nextInt();

            for(int i = 1; i <= num; i++){
                fact *= i;
            }

            System.out.println("Factorial :"+fact);

        // multiplication

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Number Sir :");
        // int table = sc.nextInt();
        
        //     for(int i = 1; i<=10; i++){
        //         int answer = table * i;
        //         System.out.println(table + " * " + i + " = "+ answer);
        //     }

        // last question


        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("i = "+ i);

        // }
        // System.out.println("i after the loop = ");
    }

    

}
