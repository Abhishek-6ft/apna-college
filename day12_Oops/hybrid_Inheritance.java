package day12_Oops;

public class hybrid_Inheritance {
    public static void main(String[] args) {
        Peacock sundari =  new Peacock();
        // sundari.breathe();
        // sundari.color = "beautiful";
        // System.out.println(sundari.color);
        // sundari.nationalBird();
        Shark cutie = new Shark();
        cutie.breathe();
        cutie.weEatFood();
        cutie.predators();
        cutie.color = "black";
        System.out.println(cutie.color);
        // cutie.swim();
    }
}

class Animal{
    String color;

    void breathe(){
        System.out.println("Breathe");
    }

    void weEatFood(){
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("We are experts in Swimming");
    }
}

class Shark extends Fish{
    void predators(){
        System.out.println("we are deadlist predators under water");
    }
}

class Tuna extends Fish{
    void RichInVitamins(){
        System.out.println("we have rich flavor and nutritional value");
    }
}

class Bird extends Animal{
    void Fly(){
        System.out.println("we are able to fly high on the sky ");
    }
}

class Peacock extends Bird{
    void nationalBird(){
        System.out.println("We are Nationl Bird of India");
    }
}

class Mammals extends Animal{
    void Birth(){
        System.out.println("we give birth to our generation");
    }
}

class Dog extends Mammals{
    void smellPower(){
        System.out.println("we have strongest smell sense in mammals");
    }
}

class Cat extends Mammals{
    void cutiePie(){
        System.out.println("we have great flexibelity in mammals");
    }
}

class Humans extends Mammals{
    void dangerousInallTime(){
        System.out.println("we are deadlist and smart mammals in world 👨‍🦰👨🏽‍🦰");
    }
}
