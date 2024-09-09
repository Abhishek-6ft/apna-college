package day13_Recursion;
// Remove Duplicate in a String 
// "appnnacollege"
// Google question
public class printStringInReverse {
    public static void printReverse(String str, int indx){
        if (indx == 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printReverse(str, indx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printReverse(str, str.length()-1);
    }
}
