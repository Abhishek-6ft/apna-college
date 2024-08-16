package day10_String;

public class Sortest_route {
    // "WNEENESENNN"
    public static float findShortRoute(String path){
        int x = 0, y =0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // south 
            if(direction == 'S'){
                y--;
            }
            // North
            else if (direction == 'N') {
                y++;
            }
            // West
            else if (direction == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "NS";


        System.out.println(findShortRoute(path));
    }

}
