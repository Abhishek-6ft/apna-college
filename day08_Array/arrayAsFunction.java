package day08_Array;

public class arrayAsFunction {

    public static void Update(int marks[], int nonChangble) {
        nonChangble = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {

        int marks[] = { 97, 98, 99 };
        int nonChangble = 5;
        Update(marks, nonChangble);
        System.out.println(nonChangble);

        // print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
