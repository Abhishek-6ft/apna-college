package day06_Functions;

public class functionOverloaded {
    
    //func to calc sum of 2 numbs
    // public static int sum(int a , int b){
    //     return a + b;
    // }
    // // function to calc sum of 3 numbs
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // // overloading with different data types
    // public static int sumInt(int a, int b){
    //     return a + b;
    // }
    // public static float sumflot(float a , float b){
    //     return a + b;
    // }


    // Check if a number is prime or not

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for (int i = 2; i <= n-1; i++) {
    //         if(n%i == 0){
    //             isPrime = false;
    //             return false;
    //         }
    //     }
    //     return(isPrime);
    // }

    // optimise method to find prime number

    public static boolean isPrimee(int n){

        if(n==2){
            return true;
        }

        for(int i=2; i<= Math.sqrt(n);i++) {
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    // public static void primesInRange(int n){
    //     for (int i = 2; i <= n; i++) {
    //         if (isPrimee(i)) {
    //             System.out.print(i+" ");
    //         }
    //     }
    //     System.out.println();
    // }

    public static void main(String[] args) {
        // System.out.println(sum(3, 5));
        // System.out.println(sum(5, 5, 5));
        // System.out.println(sumInt(3, 5));
        // System.out.println(sumflot(1.2f , 2.8f));

        // System.out.println(prime(1));

        // System.out.println(isPrimee(16));

        // primesInRange(100);

    }
}
