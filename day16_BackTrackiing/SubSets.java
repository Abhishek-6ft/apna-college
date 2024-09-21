package day16_BackTrackiing;

public class SubSets {
    public static void FindSubSets(String stri, String answer, int i){
        // base case
        if (i == stri.length()) {
            if (answer.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(answer);
            }
            return;
        }
        // recursion
        // yes choice
        FindSubSets(stri, answer+stri.charAt(i), i+1);
        // no choice
        FindSubSets(stri, answer, i+1);
    }
    public static void main(String[] args) {
        String stri = "AAB";
        FindSubSets(stri, "", 0);
    }
}
