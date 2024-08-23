package day12_Oops;
// poly means many and morphism means forms
// -Compile Time Polymorphism
        // . Method Overloading

// -Run Time Polymorphism
        // . Mehtod Overriding

// Method Overloading
// - Multiple functions with the same name but different parameters

public class Polymorphism {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        system.out.println(calc.sum(1, 2));
        system.out.println(calc.sum(1.5, 2.5));
        system.out.println(calc.sum(1, 2, 3));
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(int a, int b){
        return a +b;
    }
    int sum(int a, int b, int c){
        return a + b +c;
    }
}
