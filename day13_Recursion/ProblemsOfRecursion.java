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
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
