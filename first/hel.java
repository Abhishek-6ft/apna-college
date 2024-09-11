package first;

/**
 * hel
 */
public class hel {
 
    public static void binaryString(int n, int lastplace, String binary){
        // base case
        if (n == 0) {
            System.out.println(binary);
        }
        // kaam
            binaryString(n-1, 0, binary+"0");
        if (lastplace == 0) {
            binaryString(n-1, 1, binary+"1");
        }
    }
    public static void main(String[] args) {
        binaryString(3, 0, "");
    }
}