package day12_Oops;
// Abstraction means : Hiding all the unnecessary details showing only the important parts to the user.
// 1. Abstract classes 2. interfaces

// Abstract Classes
// - Cannot create an instance of abstract class
// - Can have abstract/non-abstract methods
// - Can have constructor

// Interfaces
// - Interface is a blueprint of a Class
// Car [wheels, speed, engine, window, door, interior] <-- Interface of car
// Maruti 800 (class) --> car 1 = M800 && car 2 = M800

// Multiple Inheritance 
// Example --> A (parent) + B (Parents) = C (Child)
// Total Abstraction
// Example --> both function was abstraction

// Interfaces
// - All Methods are public, abstract & without implemention
// - Used to achieve total Abstraction
// - Variables in the interfaces are final, public and static

public class Abstraction {
    public static void main(String[] args) {
        // Create Horse Object
        // Horse badal = new Horse();
        // badal.eat();
        // badal.walk();
        // System.out.println(badal.color);
        // Create chicken object
        // Chicken murga = new Chicken();
        // murga.eat();
        // murga.walk();

        // We can create a object of Abstract classes
        // Animalss a = new Animalss();

        // Mustang myhorse = new Mustang();
        // Animal -> Horse -> Mustang

        Queen q = new Queen();
        q.moves();

    }
}

// Interface Example
interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}
// Abstract Example
// abstract class Animalss{
//     //  make constructor for exampal
//     String color;
//     Animalss() {
//         System.out.println("animal constructor called");
//         color = "brown";
//     }

//     void eat() {
//         System.out.println("Animals eats");
//     }
//     abstract void walk();
// }

// subclass 
// class Horse extends Animalss{
//     Horse(){
//         System.out.println("Horse constructor called");
//     }

//     void changeColor() {
//         color = "Dark Brown";
//     }

//     void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }
// }

// class Chicken extends Animalss{

//     void changeColor() {
//         color = "Dark Brown";
//     }

//     void walk(){
//         System.out.println("Wals on 2 legs");
//     } 
// }
