package day11_BitManulpation;

public class Question {

    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
 
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if ((n & bitmask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }
    public static int getSetBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int ClearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     return ClearIthBit(n, i);
        // }else{
        //     return getSetBit(n, i);
        // }

        n = ClearIthBit(n, i);
        int bitmask = newBit<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int clearRange(int n,int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(14);
        System.out.println(getIthBit(10, 2));
        System.out.println(getSetBit(6, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2,1));
        System.out.println(clearIthBit(15, 2));
        System.out.println(clearRange(10, 2, 4));
    }
}
