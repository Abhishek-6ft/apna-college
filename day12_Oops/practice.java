package day12_Oops;

public class practice {
    public static void main(String[] args) {
        StudentBioData infoStudentfirst = new StudentBioData();
        infoStudentfirst.name = "Abhishek kumar";
        infoStudentfirst.roll = 21;
        infoStudentfirst.standard = "B.com pursuing from DU (School of open learning)";
        infoStudentfirst.studentID = 223430009;
        infoStudentfirst.DOB = "7/10/2104";
        infoStudentfirst.currentYearPercentage = 73.25;
        infoStudentfirst.previousYearPercentage = 71.50;
        infoStudentfirst.marksCurrentYear = "69, 71, 70";
        infoStudentfirst.marksPreviousYear = "66, 70, 72";
        infoStudentfirst.studentFatherName = "Surender";
        infoStudentfirst.studentMotherName = "simpy";

        // System.out.println(infoStudentfirst.name);
        // System.out.println(infoStudentfirst.DOB);



        StudentBioData infoStudentSecond = new StudentBioData(infoStudentfirst);
        infoStudentfirst.DOB = "7/2/2004";
        infoStudentfirst.name = "sunny";

        
        System.out.println(infoStudentfirst.name);
        System.out.println(infoStudentfirst.DOB);


    }
}

class StudentBioData{
    String name;
    int roll;
    String standard;
    int studentID;
    String DOB;
    double currentYearPercentage;
    double previousYearPercentage;
    String marksCurrentYear;
    String marksPreviousYear;
    String studentFatherName;
    String studentMotherName;


    StudentBioData(StudentBioData infoStudentfirst){
        this.name = infoStudentfirst.name;
        this.roll = infoStudentfirst.roll;
    }


    StudentBioData() {
        //TODO Auto-generated constructor stub
    }
}