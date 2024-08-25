package day12_Oops;

public class Practice_Question {
    public static void main(String[] args) {
        // Question first find out the correct statement to assign name to object
        Studentfit s = new Studentfit();
        s.name = "abhishek";
        // System.out.println(s.name);

        // Question second which variable can the class person access in the following` code?
        Person p = new Person();
        p.name = "abhishek";
        p.weight = 68;
        // Sdnt abhishek = new Sdnt();
        // abhishek.weight = 12;
        // System.out.println(abhishek.weight);
        // System.out.println(p.name);
        // System.out.println(p.weight);

        // Question third which of the following modifiers are not allowed in front of class
        // 1. Public
        // 2. Protected true
        // 3. Private true
        // 4. Deafult

    }
}

//  Question 1

class Studentfit {
    String name;
    int roll;
}

// Question 2

class Person {
    String name;
    int weight;
}
class Sdnt extends Person{
    int rollnumber;
    String schoolNme;
}