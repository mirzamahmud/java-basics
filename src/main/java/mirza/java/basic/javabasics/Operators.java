package mirza.java.basic.javabasics;

// Operator: it is a symbol that is used to perform operations.
public class Operators {
    // this method is used for unary operator
    public static void exampleOfUnaryOperator(){
        int firstNumber = 10;
        int secondNumber = -20;     
        boolean boolVar = true;
        
        System.out.println("Postfix (expr++): " + (firstNumber++)); // expr++
        System.out.println("Postfix (expr--): " + (firstNumber--)); // expr--
        System.out.println("Prefix (++expr): " + (++firstNumber)); // ++expr
        System.out.println("Prefix (--expr): " + (--firstNumber)); // --expr
        
        System.out.println("First Number: " + (~firstNumber)); // minus of total positive value which starts from 0
        System.out.println("Second Number: " + (~secondNumber)); // positive of total minus, positive starts from 0
        
        System.out.println("Boolean Var: " + (!boolVar)); // opposite of boolean value
    }
    
    // this method is used for arithmetic operator
    public static void exampleOfArithmeticOperator(){
        int num1 = 20;
        int num2 = 10;
        
        System.out.println("Addition: " + (num1 + num2)); // addition
        System.out.println("Subtraction: " + (num1 - num2)); // subtraction
        System.out.println("Multiplication: " + (num1 * num2)); // multiplication
        System.out.println("Division: " + (num1 / num2)); // division
        System.out.println("Modulus: " + (num2 % num1)); // modulus
    }
    
    // this method is used for shift operator
    public static void exampleOfShiftOperator(){
        int num1 = 20;
        
        System.out.println("Left Shift: " + (num1 << 3)); // num1*2^3
        System.out.println("Right Shift: " + (num1 >> 2)); // num1/2^2
    }
    
    // this method is used for relational operator
    public static void exampleOfRelationalOperator(){
        int num1 = 20;
        int num2 = 10;
        
        System.out.println("Greater Than: " + (num1 > num2)); // greater than (>)
        System.out.println("Less Than: " + (num1 < num2)); // less than (<)
        System.out.println("Greater Than Or Equal: " + (num1 >= num2)); // greater than or equal (>=)
        System.out.println("Less Than Or Equal: " + (num1 <= num2)); // less than or equal (<=)
        
        String name = "ABCD";
        boolean result = name instanceof String;
        System.out.println("Instance of: " + result); // instanceof keyword
        
        System.out.println("Equal to: " + (num1 == num2)); // less than or equal (==)
        System.out.println("Not Equal: " + (num1 != num2)); // not equal (!=)
    }
    
    // this method is used for bitwise operator
    public static void exampleOfBitwiseOperator(){
        
    }
    
    // this method is used for logical operator
    public static void exampleOfLogicalOperator(){
        
    }
    
    // this method is used for ternary operator
    public static void exampleOfTernaryOperator(){
        
    }
    
    // this method is used for assignment operator
    public static void exampleOfAssignmentOperator(){
        
    }
}
