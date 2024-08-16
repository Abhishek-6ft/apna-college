package day07_Advance_Pattern;

public class patters {

    //**********************Hollow Rectangle***************************
    public static void hollow_rectange(int totalRows ,int totalCol){

        // outer loop
        for (int i = 1; i <= totalRows; i++) {
            // inner loop - coloums
            for (int j = 1; j<=totalCol ; j++) {
                // cell - (i, j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCol) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //******************** Inverted & rotated Half pyramid *****************************
    public static void Inverted_rotated_half_pyramid(int n){

        // outer
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stares
            for (int j = 1; j <=i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

      }

    // *******************Inverted half-pyramid*******************************
    public static void inverted_half_pyramid(int n){

        // outer
        for (int i = 1; i <= n; i++) {
            //inner
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }

    // ***********************Floud's triangle***************************
    public static void flouds_triangle(int n){
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    //*********************0-1 triangle*********************************
    public static void zero_one_triangle(int n){
        //outer
        for (int i = 1; i <=n ; i++) {
            // inner
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    //**************************solid rhombus*************************************

    public static void solid_rhombus(int n){
        // outer
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //stares
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // **************************Hollow rhombus*********************************

    public static void hoolow_rhombus(int n){
        // outer'
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            // hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    // *********************************Diamod pattern********************************
    public static void diamod(int n){
        //outer
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <=(n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <=(n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // hollow_rectange(10, 8);
        // Inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid(5);
        // flouds_triangle(5);
        // zero_one_triangle(6);
        // solid_rhombus(10);
        // hoolow_rhombus(5);
        diamod(60);
    }
}
