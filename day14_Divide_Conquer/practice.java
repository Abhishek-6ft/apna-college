package day14_Divide_Conquer;

public class practice {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSortArray(int array[], int strtIndex, int endingIndx){
        // base case
        if (strtIndex >= endingIndx) {
            return;
        }
        // work 
        int midIndex = strtIndex + (endingIndx - strtIndex) / 2;
        mergeSortArray(array, strtIndex, midIndex);
        mergeSortArray(array, midIndex+1, endingIndx);

        mergeArrays(array, strtIndex, midIndex, endingIndx);
    }
    public static void mergeArrays(int array[], int strtIndex, int midIndex, int endingIndx){
        int temp[] = new int[endingIndx - strtIndex + 1];
        int i = strtIndex;
        int j = midIndex+1;
        int k = 0;

        while (i <= midIndex && j <= endingIndx) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else{
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        // left
        while (i <= midIndex) {
            temp[k++] = array[i++];
        }
        //right
        while (j <= endingIndx) {
            temp[k++] = array[j++];
        }

        for(k=0, i=strtIndex; k<temp.length; k++, i++){
            array[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int array[] = {4, 5, 2, 9, 1, 7};
        mergeSortArray(array, 0, array.length-1);
        printArray(array);
    }
}
