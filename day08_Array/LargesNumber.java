package day08_Array;
// import java.util.*;

public class LargesNumber {
    public static int Getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 8, 6, 19, 2, 1 };
        System.out.println("largest value is : " + Getlargest(number));
    }
}
