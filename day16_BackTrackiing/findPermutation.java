package day16_BackTrackiing;

public class findPermutation {
    public static void fndPermutation(String strr, String ans){
        // base case
        if (strr.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < strr.length(); i++) {
            char current = strr.charAt(i);
            String Newstrr = strr.substring(0, i) + strr.substring(i+1);
            fndPermutation(Newstrr, ans+current);
        }
    }
    public static void main(String[] args) {
        String Strr = "raj";
        fndPermutation(Strr, "");
    }
}
