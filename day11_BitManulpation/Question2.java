package day11_BitManulpation;

public class Question2 {
    public static boolean isPowertrue(int n){
        return (n&(n-1)) == 0;
    }
    // count set bit in a number
    // google question
    public static int countSetBit(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check lsb
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // check number is power of 2
        System.out.println(isPowertrue(16));
        System.out.println(countSetBit(4));
    }
}
