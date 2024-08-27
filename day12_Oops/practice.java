package day12_Oops;

public class practice {

    public class ElectricCar extends Car {
        @Override
        public final String drive(){
            return "Driving electric car";
        }

    }
    // 
    //new question
    abstract class car{
    static {
        System.out.println("1");
    }
    public car(String name){
        super();
        System.out.print("2");
    }
    {
        System.out.print("3");
    }  
}
public class BlueCar extends car {
    {
        System.out.print("4");
    }
    public BlueCar(){
        super("blue");
        System.out.println("5");
    }
}
    //
    public static void main(String[] args) {
    //    System.out.println(new BlueCar());
        // ElectricCar c = new ElectricCar();
        // System.out.println();
        

        // StudentBioData infoStudentfirst = new StudentBioData();
        // infoStudentfirst.name = "Abhishek kumar";
        // infoStudentfirst.roll = 21;
        // infoStudentfirst.standard = "B.com pursuing from DU (School of open learning)";
        // infoStudentfirst.studentID = 223430009;
        // infoStudentfirst.DOB = "7/10/2104";
        // infoStudentfirst.currentYearPercentage = 73.25;
        // infoStudentfirst.previousYearPercentage = 71.50;
        // infoStudentfirst.marksCurrentYear = "69, 71, 70";
        // infoStudentfirst.marksPreviousYear = "66, 70, 72";
        // infoStudentfirst.studentFatherName = "Surender";
        // infoStudentfirst.studentMotherName = "simpy";
    
        // System.out.println(infoStudentfirst.name);
        // System.out.println(infoStudentfirst.DOB);
        
        // StudentBioData infoStudentSecond = new StudentBioData(infoStudentfirst);
        // infoStudentfirst.DOB = "7/2/2004";
        // infoStudentfirst.name = "sunny";
        
        // System.out.println(infoStudentfirst.name);
        // System.out.println(infoStudentfirst.DOB);
        
        // interface Example
        Bear b = new Bear();
        b.vegetarian();
        b.Non_vegetarian();

        // 2 example of inheritance
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 5);

        // Question 3

    }    
}
// Automobile example

class Automobile {
    private String drive() {
        return "Driving vehicle";    
    }
}
class Car extends Automobile{
    protected String drive(){
        return "Driving car";
    }
}


interface Herbivorus{
    void vegetarian();
}

interface Carnivorus{
    void Non_vegetarian();
}

class Bear implements Herbivorus, Carnivorus{
    public void vegetarian() {
        System.out.println("i like grass");
    }

    public void Non_vegetarian(){
        System.out.println("i also like meat baby");
    }
}

// Second Example of inheritance
    interface Polygon{
        void getArea(int length, int breath);
    }

    class Rectangle implements Polygon{
        public void getArea(int length, int breath){
            System.out.println("The area of Rectangle is " + (length * breath));
        }
    }

// End of interface Example

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
