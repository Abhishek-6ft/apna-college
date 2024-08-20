
package day12_Oops;

public class OOPS {
    public static void main(String args[]){
        Pen natrajPen = new Pen();  // created a pen obejct called natrajPen
        natrajPen.setColor("Blue");
        System.out.println("Colour :" + natrajPen.color);

        natrajPen.setTip(5);
        System.out.println("Tip :" + natrajPen.tip);

        // natrajPen.setColor("Purple");

        natrajPen.color = "Yellow";
        System.out.println("Colour :" + natrajPen.color);


        // making a bank account
        BankAccount mAccount = new BankAccount();
        mAccount.username = "Abhishek";
        mAccount.Age = 20;
        mAccount.accountNumber = 999906665;
        mAccount.IFSC_Code = "HDFC0000888555";
        mAccount.residentalAddress = "HOUSE NO D-1061, GALI NO-2, OM ENCLAVE PART-2, AGWANPUR, FARIDABAD HARYANA-121003";
        mAccount.branchAddress = "A-5, Jaitpur Rd, Block B, Molar band Extension, Badarpur, New Delhi, Delhi 110044";
        mAccount.setPassword("HDFCAbhishek87006ft");

        // print all deatils of account holder
        System.out.println("HDFC Bank");
        System.out.println("Account holder details given below");
        System.out.println("Account holder name : " + mAccount.username);
        System.out.println("Age : " + mAccount.Age);
        System.out.println("Account Number : " + mAccount.accountNumber);
        System.out.println("IFSC Code : " + mAccount.IFSC_Code);
        System.out.println("Residental Address : " + mAccount.residentalAddress);
        System.out.println("if you have any enquiry and problem please visit your near branch branch address given below");
        System.out.println("Branch Address : " + mAccount.branchAddress);
    }
}
// Example of making bank account
class BankAccount{
    public String username;
    public int Age;
    public int accountNumber;
    public String IFSC_Code;
    public String residentalAddress;
    protected String branchAddress;
    private String password;
    public void setPassword(String pwsd){
        password = pwsd;
    }
}



// Example of making pen properties

// class name always start with capital letter 
class Pen {

    // properties of pen
    String color;
    int tip;
    

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

// Example of making student class

class student{
    String name;
    int age;
    float percentage; //CGPA


    void calcPercentage(int phy, int chem, int math){
        percentage = ((phy + chem + math)*100) / 3;
    }
}