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
        return;
    }
    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        printInc(n);
    }
}

// for (int i = 10; i >= 1; i--) {
//     System.out.println(i);
// }
