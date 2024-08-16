package day02;

import java.util.*;

public class inputin {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        String name = input.nextLine();
        System.out.print(name);

        int number = input.nextInt();
        System.out.println(number);

        float price = input.nextFloat();
        System.out.println(price);

        boolean hello = input.nextBoolean();
        System.out.println(hello);

    }
}
