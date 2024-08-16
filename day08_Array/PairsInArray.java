package day08_Array;

public class PairsInArray {

    public static void printPairs(int number[]){
        int tp =0;
        for(int i= 0; i < number.length; i++){
            int current = number[i]; // 2,4,6,8,10

            for (int j = i+1; j < number.length; j++) {
                System.out.print("(" + current + ","  + number[j] + ") ");
                tp++;
            }

            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }


    public static void main(String[] args) {
        
        int number[] = {1, 2, 3, 4, 5, 8};
        printPairs(number);

    }
}
