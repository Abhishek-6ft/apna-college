package day04_Loops;

import java.util.Scanner;

public class forloops {
    public static void main(String arges[]){
        // int i =1;
        // for(int i = 1; i <= 10; i++){
        //     System.out.println("hello world");
        // }
        // for(int i = 0; i <= 100; i = i+25){
        //     System.out.println(i);
        // }
        // for(int line = 1; line <= 4; line++){
        //     System.out.println("****");
        // }

        // break statement
        
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 30) {
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // System.out.println("i am out");

        /* /////////////////////////////////////////////// */

        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.print("Enter your number : ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) { 
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

        /* /////////////////////////////////////////////// */

        // for (int i = 1; i <=5 ; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        /* /////////////////////////////////////////////// */

        // Scanner sc = new Scanner(System.in);
        
        // do{
        //     System.out.println("Enter Your number :");
        //     int n = sc.nextInt();

        //     if (n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println("Number was : " + n);
        // }while(true);

        /* /////////////////////////////////////////////// */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is prime");
        }
        else{
                boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0) { // n is a multiple of i (i not equal to  1 or n)
                    isPrime = false;
                }
            }
    
            if (isPrime == true) {
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }
        

    }
}
