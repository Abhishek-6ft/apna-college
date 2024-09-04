package day13_Recursion;

public class TowerOfHanoi {
    public static void hanoiTower(int n, String src, String helper, String destination){
        // base case
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " +destination);
            return;
        }

        hanoiTower(n-1, src, destination, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " +destination);
        hanoiTower(n-1, helper, src, destination);
    }
    public static void main(String[] args) {
        int n = 5;
        hanoiTower(n, "Source", "Helper", "Destination");
    }
}
