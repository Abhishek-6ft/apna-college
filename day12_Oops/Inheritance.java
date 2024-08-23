package day12_Oops;
/* 
    Inheritance
    Inheritance is when properties & method of base class are passed on to ta derived class
    
    Types of Iheritance

    1. Single Level Inheritance
    Base Class ---> Derived Class
    Example --> below (Animal)

    2. Multi Level Inheritance
    Base Class --> Derived Class --> Derived Class
    Example : Animal(func eat,breathe prop. color) --> Mammals(prop. legs) --> Dog(breed)

    3. Hierarchial Inheritance

   4. Hybird Inheritance
   

*/
public class Inheritance {
    public static void main(String[] args) {
        
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();

        // Dog bunny = new Dog();
        // bunny.color = "black";
        // bunny.eat();
        // bunny.legs =4;
        // System.out.println(bunny.legs);
        // System.out.println(bunny.color);


        // Fish scobby = new Fish();
        // scobby.breathe();
        // scobby.Swin();
        // scobby.breathe();
        // scobby.eat();
        // scobby.color = "gold";
        // System.out.println(scobby.color);


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

class Fish extends Animal{
    void Swin(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("Walks");
    }
}

// class Dog extends Mammal{
//     String breed;
// }

// Drive Class 
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swim in water");
//     }
// }