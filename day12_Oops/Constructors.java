package day12_Oops;

// Constructors

// Constructor is a special method which is invoked automatically at the time of obejct creation.

// -Constructors have the same name as class or structure.
// -Constructors don't have a return type. (Not even void)
// -Constructors are only called once, at obejct creation.
// -Memory allocation happens when constructor is called.

public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student("Abhishek");
        // System.out.println(s1.name);

    }
}


class Student {
    String name;
    int rollno;

    //Constructors

    Student(String name) {
        // this.name = name;
        System.out.println("constructor is called....");
    }
}