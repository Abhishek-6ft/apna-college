package day16_BackTrackiing;

public class BacktrackingInArray {
    public static void changeArr(int array[], int i, int value){

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
