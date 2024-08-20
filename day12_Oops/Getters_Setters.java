package day12_Oops;
// Getters & Setters 
// Get : to return the value
// Set : to modify the value 
// this : this keyword is used to refer to the current object
public class Getters_Setters {
    
}

class Pen {
    private String color;
    private int tip;
    // getters function
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    // Setters functions
    void setColor(String newColor){
        this.color = newColor;
    }
    
    void setTip(int newTip){
        this.tip = newTip;
    }
}

