package day12_Oops;

// Static Keyword in java is used to share the same variable or method of a given class.
// -Properties
// -Functions
// -Blocks
// -Nested Class

public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "DAV";

        Student s2 = new Student();
        Systom.out.println("s2.schoolName");
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    void getName(){
        this.name = name;
    }
}
