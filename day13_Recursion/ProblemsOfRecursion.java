package day13_Recursion;

public class ProblemsOfRecursion {
    // Question 1 Remove duplicates in a string
    public static void removeDuplicates(String str, int index, StringBuilder newString, boolean map[]){
        // base case
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        // work
        char currentChar = str.charAt(index);
        if (map[currentChar-'a'] == true) {
            removeDuplicates(str, index+1, newString, map);
        } else{
            map[currentChar-'a'] = true;
            removeDuplicates(str, index+1, newString.append(currentChar), map);
        }
    }
    // Question 2 Friends pairing problem
    // Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number
    // of ways in which friends can remain single or can be paired up
    public static int friendsPairing(int n){
        // base case
        if(n == 1 || n == 2){
            return n;
        }
        // choice
        // single
        int fnm_1 = friendsPairing(n-1);
        // pairing
        int fnm_2 = friendsPairing(n-2);
        int pairways = (n-1) * fnm_2;

        int totalWays = fnm_1 + pairways;
    }
    public static void main(String[] args) {
        // String str = "appnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        friendsPairing(3);
    }
}
