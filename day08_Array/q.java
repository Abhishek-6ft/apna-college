package day08_Array;

public class q {
    // CGPA calculator

    public static void cgpa(int percentage){
        // calculatePercentage;
        if (percentage >= 95) {
            System.out.println("Grade : A+");
        }else if (percentage >= 90) {
            System.out.println("Grade : A");
        }else if(percentage >= 85) {
            System.out.println("Grade : B+");
        }else if(percentage >= 80) {
            System.out.println("Grade : B");
        }else if(percentage >= 75) {
            System.out.println("Grade : C+");
        }else if(percentage >= 70) {
            System.out.println("Grade : C");
        }else if(percentage >= 60) {
            System.out.println("Grade : D");
        }else{
            System.out.println("FAIL");
        }
    }
    public static void main(String[] args) {
      

        int marks[] = { 85, 67, 92, 87, 60 };

        int math, english, business, accountancy, economics;

        math = marks[0];
        english = marks[1];
        business = marks[2];
        accountancy = marks[3];
        economics = marks[4];

        System.out.println("Marks obtained in Mathematics: " + marks[0] + ","+ " English: " + marks[1] + "," + " Business Studies: "
                + marks[2] + "," + " Accounting: " + marks[3] + "," + " Economics: " + marks[4]);
        
        int percentage;
        percentage = (marks[0] + marks[1] + marks[2] + marks[3] +marks[4]) / 5;
        System.out.println("Perctange obtained : " + percentage + "%");
        cgpa(90);

    }
}
