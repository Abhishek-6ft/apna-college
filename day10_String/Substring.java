package day10_String;

public class Substring {

    public static String subString(String str, int strt, int end){
        String substr = "";

        for (int i = strt; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }


    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(str.substring(0, 5));
        System.out.println(subString(str, 0, 5));
    }
}
