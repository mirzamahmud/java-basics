package mirza.java.basic.javabasics;

public class JavaBasics {
    public static void main(String args[]){
        // --------- Basic ---------
        System.out.println("Hello World!");
        
        // --------- Variables --------
        Variables.exampleOfLocalVariable(); // local variable
        System.out.println("My Age: " + Variables.myAge); // static variable
        double myBalance = 39802.6325; // instance variable
        System.out.println("My Balance: " + myBalance + " BDT");
        
        // ---------- Data Types ---------
        DataTypes.exampleOfPrimitiveDataType(); // primivite data type
        DataTypes.exampleOfNonPrimitiveDataType(); // non-primitive data type
    }
}
