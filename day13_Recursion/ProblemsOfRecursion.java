package day13_Recursion;

public class ProblemsOfRecursion {
    // Question 1 Remove duplicates in a string
    // public static void removeDuplicates(String strr, int index, StringBuilder newString, boolean map[]){
    //     // base case
    //     if(index == strr.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     // work
    //     char currentChar = strr.charAt(index);
    //     if (map[currentChar-'a'] == true) {
    //         removeDuplicates(strr, index+1, newString, map);
    //     } else{
    //         map[currentChar-'a'] = true;
    //         removeDuplicates(strr, index+1, newString.append(currentChar), map);
    //     }
    // }
    // Question 2 Friends pairing problem
    // Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number
    // of ways in which friends can remain single or can be paired up
    // public static int friendsPairing(int n){
        // base case
        // if(n == 1 || n == 2){
        //     return n;
        // }
        // choice
        // single
        // int fnm_1 = friendsPairing(n-1);
        // // pairing
        // int fnm_2 = friendsPairing(n-2);
        // int pairways = (n-1) * fnm_2;
        // int totalWays = fnm_1 + pairways;
        // return totalWays;
        // single statement
        // return friendsPairing(n-1) + (n - 1) * friendsPairing(n-2);
    // }
    // Qustion 3 Binary String Problem
    // Print all binary strings of size N without consecutive ones.
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
        // if (lastplace == 0) {
        //     // sit 0 on chair n
        //     // st.append("0");
        //     binaryString(n-1, 0, st.append("0"));
        //     binaryString(n-1, 1, st.append("1"));
        // }else {
        //     binaryString(n-1, 0, st.append("0"));
        // }

    }
    public static void main(String[] args) {
        // String str = "appnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
        binaryString(3, 0, "");
    }
}