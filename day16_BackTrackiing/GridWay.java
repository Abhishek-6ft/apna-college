package day16_BackTrackiing;

public class GridWay {
    public static int gridWays(int i, int j, int n, int m){
        if (i == n-1 && j == m-1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int way_1 = gridWays(i+1, j, n, m);
        int way_2 = gridWays(i, j+1, n, m);
        return way_1 + way_2;

    }
    public static void main(String[] args) {
        int n = 4, m = 4;    
        System.out.println(gridWays(0, 0, n, m));
    }
}
