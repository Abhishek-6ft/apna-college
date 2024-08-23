package day12_Oops;
// poly means many and morphism means forms
// -Compile Time Polymorphism
        // . Method Overloading

// -Run Time Polymorphism
        // . Mehtod Overriding

// Method Overloading
// - Multiple functions with the same name but different parameters.


public class Polymorphism {
    public static void main(String args[])
                            
        // Example of method overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));

        // call method overriding example
        Deer d = new Deer();
        d.eat();
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a +b;
    }
    int sum(int a, int b, int c){
        return a + b +c;
    }
}
// Method Overriding
// - Parent and child classes both contain the same function with a different definition.

class Animal{
        void eat(){
          System.out.println("Eats Anything");                
        }
}

class Deer extends Animal{
        void eat(){
          System.out.println("Eat Grass");                
        }
}
