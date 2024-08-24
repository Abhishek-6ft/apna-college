package day12_Oops;
// Abstraction means : Hiding all the unnecessary details showing only the important parts to the user.
// 1. Abstract classes 2. interfaces

// Abstract Classes
// - Cannot create an instance of abstract class
// - Can have abstract/non-abstract methods
// - Can have constructor

public class Abstraction {
    public static void main(String[] args) {
        // Create Horse Object
        Horse badal = new Horse();
        badal.eat();
        badal.walk();
        // Create chicken object
        Chicken murga = new Chicken();
        murga.eat();
        murga.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}

// subclass 
class Horse extends Animal{
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Wals on 2 legs");
    } 
}
