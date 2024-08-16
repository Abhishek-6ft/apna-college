package day06_Functions;

public class convertBinaryToDecimal {

    // binary to decimal
    // public static void binToDec(int binNum){
    //     int myNum = binNum;
    //     int power = 0;
    //     int decimal = 0;
    //     while (binNum > 0) {
    //         int lastdigit = binNum % 10;
    //         decimal = decimal + (lastdigit * (int)Math.pow(2, power));
    //         power ++;
    //         binNum = binNum /10;
    //     }

    //     System.out.println("decimal of " + myNum + " = " + decimal);
    // }
    // decimal to binary

        public static void DectoBin(int n){
            int pow =0;
            int binNumer = 0;
            int myNum = n;
            

            while (n>0) {
                int reminder = n%2;
                binNumer = binNumer + (reminder * (int) Math.pow(10, pow));
                pow ++;
                n = n / 2 ;
            }

            System.out.println("Binary form of " + myNum + " = " + binNumer);
        }
    public static void main(String[] args) {
        /*
            math = binary
            (0)10 = (0)2
            (1)10 = (01)2
            (2)10 = (10)2
            (3)10 = (11)2
            (4)10 = (100)2
            (5)10 = (101)2
            (6)10 = (110)2
            (7)10 = (111)2
            (8)10 = (1000)2
            and so on
                *******************binary to decimal**********************
            power =0;
            decimal = 0;
            dec = dec +ld (last digit of binary) * 2 ki power
                *******************decimal to binary********************** 

        */
        // binToDec(101);
        DectoBin(999);
    }
}
