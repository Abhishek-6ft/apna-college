package day15_Time_Complexity;

public class loops {
    // public static void loop(int arr[]){
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     // time complexity of single loops is ****O(n)****
        //     System.out.println(arr[i]);
        // }
    // }
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 3};
        // simple loops
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // nested loop
        // time complexity of nested loops are O(n*2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                System.out.print(arr[i+j] + " N ");
            }
        }
        System.out.println();

    }
}
