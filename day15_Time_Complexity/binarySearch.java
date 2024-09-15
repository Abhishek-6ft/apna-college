package day15_Time_Complexity;

public class binarySearch {
    public static int search(int arr[], int target){
        int strt = 0, end = arr.length-1;
        while (strt <= end) {
            int mid = strt + (end - strt) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                strt = mid + 1;
            } else{
                mid = strt - 1;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8, 9, 5, 6, 1, 2, 7, 0, 3, 4};
        int target = 8;
        search(arr, target);
    }
}
