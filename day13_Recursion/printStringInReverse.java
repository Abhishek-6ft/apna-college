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
    // Find the 1st and last occurance of an elment in string
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar =  str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else{
                last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }
    // check if an array is sorted (Stricly increasing)
    public static boolean isSorted(int arr[], int index){
        // base case
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            // arry is unsorted
            return false;
        }
            return isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        String str = "baacdgtrflakkdd";
        int arr[] = {1, 3, 5, 8, 7};
        // System.out.println(isSorted(arr, 0));
        // printReverse(str, str.length()-1);
        findOccurance(str, 0, 'a');
    }
}
