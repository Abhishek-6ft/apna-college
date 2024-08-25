package day12_Oops;
// Super keyword

// Super keyword is used to refer immediate parent class object
// -to access parent's properties
// -to access parent's functions
// -to access parent's constructor

public class Super_keyword {
    public static void main(String[] args) {
        HorseIndian broce = new HorseIndian();
        System.out.println(broce.color);
        
    }
}

class IndianAnimal{
    String color;
    IndianAnimal(){
        System.out.println("animal constructor is called");
    }
}

class HorseIndian extends IndianAnimal {
    HorseIndian(){
        // super();
        super.color = "brown";
        System.out.println("Horse constructor is called");   
    }
}
