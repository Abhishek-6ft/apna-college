package day13_Recursion;

public class recursion {
    
    
    // Question 1 : print numbers from n to 1 (Decreasing Order)
    public static void printDec(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    // Question 2 : Print number n to 1 (increasing order)
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    // Question 3 : Print factorial of a number n.
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fN_1 = fact(n -1);
        int fn = n * fact(n-1);
        return fn;
    }
    
    // Question 4 : Print sum of first n Natural Numbers.
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        int SN_1 = sum(n - 1);
        int Sn = n + SN_1;
        return Sn;
    }
    // Question 5 : Print Nth fibonacci number
    public static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fn_1 = fib(n-1);
        int fn_2 = fib(n-2);
        int fni = fn_1 + fn_2;
        return fni;
    }
    
    // Question 6 : Check if a given array is sorted or not
    
    public static void main(String[] args) {
        int n = 25;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        System.out.println(fib(n));
    //     System.out.println(fib(24));
    //     System.out.println(fib(25));
    //     System.out.println(fib(26));
    //     System.out.println(fib(27));
    //     System.out.println(fib(28));
    }
}

// for (int i = 10; i >= 1; i--) {
//     System.out.println(i);
// }