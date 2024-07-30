package mirza.java.basic.javabasics;

// Variables: It is a container which holds the value while the program is executed.
// variables is assigned with a Data Type.
// there are three types of variables in Java
// - local variable
// - instance cariable
// - static variable
public class Variables {
    // static variables: a variable which is declared as static is callled a static variables
    // Memory allocation for static variables happens only once when the class is loaded in the memory.
    public static int myAge = 25;
    
    // local variables: A variable declared inside the body of the method
    // local variable cannot be defined with "static" keyword.
    public static void exampleOfLocalVariable(){
        String myName = "Mirza Mahmud Hossan";
        System.out.println("My Name: " + myName);
    }
}
