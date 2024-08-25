package day12_Oops;

// Static Keyword in java is used to share the same variable or method of a given class.
// -Properties
// -Functions
// -Blocks
// -Nested Class

public class StaticKeyword {
    public static void main(String[] args) {
        
        StudentSbv manoj = new StudentSbv();
        manoj.schoolName = "ITI";
        System.out.println(manoj.schoolName);
        
        StudentSbv abhishek = new StudentSbv();
        System.out.println(abhishek.schoolName);
        
        StudentSbv sanjay = new StudentSbv();
        // sanjay.schoolName = "Sarvodya bal vidayala";
        System.out.println(sanjay.schoolName);
        System.out.println(sanjay.returnPercentage(100, 100, 99));


    }
}

class StudentSbv {

    static int returnPercentage(int math, int phy, int chem){
        return ((math + phy + chem) / 3) ;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
