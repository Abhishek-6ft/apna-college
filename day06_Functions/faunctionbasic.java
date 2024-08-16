package day06_Functions;
import java.util.*;
public class faunctionbasic {
    // this is function example
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return;

    }

    public static int calculatesum(int a, int b){ //parameters or formal parameter

        int sum = a + b;
        return sum;
 

    }
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);// argument or actual parameters
        System.out.println(sum);
    }
    
}
