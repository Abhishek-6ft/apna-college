package day06_Functions;

public class callByValue {

    public static void swap(int a, int b){
         
        // swap 
        int temp = a;
        a = b;
        b = temp;
    }

    public static int multi(int a, int b){
        int product = a * b;
        return product;
    }

    // factorial function
    public static int factorial(int n){
        int f = 1;
        
        for(int i=1; i<=n; i++){
            f = f * i;
        }

        return f;
    }

    public static int binoCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = (r);
        int fact_nMinusr = factorial(n -r);
        int binoCoff = fact_n/(fact_r * fact_nMinusr);

        return binoCoff;

    }

    public static void main(String[] args) {
        // swap - values exchange
        // int a = 500;
        // int b = 100;
        // swap(a, b);
        // int prod = multi(a,b);
        // System.out.println(prod);
        // prod =multi(10,15);
        // System.out.println("a * b = " + multi(10, 15));

        // System.out.println(factorial(12));

        System.out.print(binoCoff(5, 2));
    }
}
