package day12_Oops;

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

public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Abhishek");
        Student s3 = new Student(123);
        // Student s4 = new Student("Raju", 5687);
        // System.out.println(s1.name);

    }
}


class Student {
    String name;
    int rollno;

    //Constructors

    Student() {
        System.out.println("constructor is called....");
    }

    Student(String name){
        this.name = name;
    }

    Student(int rollno){
        this.rollno = rollno;
    }
}