package day16_BackTrackiing;

public class BacktrackingInArray {
    public static void changeArr(int array[], int i, int value){
        //base case
        if (i == array.length) {
            printArray(array);
            return;
        }

        //recursion
        array[i] = value;
        changeArr(array, i+1, value+1);
        array[i] = array[i] - 2;

    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");   
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = new int[5];
        changeArr(array, 0, 1);
        printArray(array);
    }
}
