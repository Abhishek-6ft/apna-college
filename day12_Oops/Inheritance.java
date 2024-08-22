package day12_Oops;
/* 

    Inheritance

    Inheritance is when properties & method of base class are passed on to ta derived class

*/
public class Inheritance {
    public static void main(String[] args) {
        
        Fish shark = new Fish();
        shark.eat();
        // shark.breathe();
    }
}

// Base class

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

// Drive Class 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in water");
    }
}