package day08_Array;

public class Print_Subarrays {

    public static void Find_Subarray(int Subarrays[]){

        int ts = 0; 

        for (int i = 0; i < Subarrays.length; i++) {
         
            int start = i;
            for (int j = i; j < Subarrays.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(Subarrays[k] + " ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total number of subarrays = " + ts);
    }


    public static void main(String args[]){
        int Subarrays[] = {2, 4, 6, 8, 10};
        Find_Subarray(Subarrays);

    }
}
