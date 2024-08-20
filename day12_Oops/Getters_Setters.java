package day12_Oops;

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

