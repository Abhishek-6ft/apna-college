package day08_Array;

public class ReverseInArray {

    public static void Reverse(int number[]){
        int first = 0 , last = number.length - 1;

        while (first < last) {
            // swap 
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first ++;
            last --;

        }
    }

    public static void main(String[] args) {
        int number[] = {1,3,5,6,8}; 

        Reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
        }
        System.out.println();
    }
}
