package day12_Oops;

// import java.sql.Struct;

// Constructors

// Constructor is a special method which is invoked automatically at the time of obejct creation.

// -Constructors have the same name as class or structure.
// -Constructors don't have a return type. (Not even void)
// -Constructors are only called once, at obejct creation.
// -Memory allocation happens when constructor is called.


// Types of Constructors

//1. Non-parameterized

//2. Parameterized

//3. Copy Constructors

// Constructor overloading when we create many constructor which have one arguments other have two arguments different types
// this is example of Polymorphism


// Shallow & Deep Copy 
// Shallow copy was a references changes was reflect
// But on the other hand Deep copy create new and they don't reflect

public class Constructors {
    public static void main(String args[]){
        // Student s2 = new Student("Abhishek");
        Student s3 = new Student(123);
        // Student s4 = new Student("Raju", 5687);
        
        // example of copy constructor
        Student s1 = new Student();
        s1.name = "abhishek singh";
        s1.rollno = 29;
        s1.password = "abcd2";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // s1 Forget their passwrd now we create other object

        Student s2 = new Student(s1); // copy value of s1
        s2.password = "xyu";
        s1.marks[2] = 100;
        // after using Deep copy the value of marks was not change when we change the marks of student 1
        for(int i=0;i<3; i++){
            System.out.println(s2.marks[i]);
        }
        // System.out.println(s1.name);

    }
}

// Copy Constructor

class Student {
    public static final char[] schoolName = null;
    String name;
    int rollno;
    String password;
    int marks[];

    //  Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }   

    // Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    //Constructors
    Student() {
        System.out.println("constructor is called....");
        marks = new int[3];
    }

    Student(String name){
        this.name = name;
        marks = new int[3];
    }

    Student(int rollno){
        this.rollno = rollno;
        marks = new int[3];
    }
}