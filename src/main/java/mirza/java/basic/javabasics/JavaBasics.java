package mirza.java.basic.javabasics;

public class JavaBasics {
    public static void main(String[] args){
        // --------- Basic ---------
        System.out.println("Hello World!");
        
        // --------- Variables --------
        Variables.exampleOfLocalVariable(); // local variable
        System.out.println("My Age: " + Variables.myAge); // static variable
        double myBalance = 39802.6325; // instance variable
        System.out.println("My Balance: " + myBalance + " BDT");
        
        // ---------- Data Types ---------
        DataTypes.exampleOfPrimitiveDataType(); // primitive data type
        DataTypes.exampleOfNonPrimitiveDataType(); // non-primitive data type
        
        // ---------- Operators ----------
        Operators.exampleOfUnaryOperator(); // unary operator
        Operators.exampleOfArithmeticOperator(); // arithmetic operator
        Operators.exampleOfShiftOperator(); // shift operator
        Operators.exampleOfRelationalOperator(); // relational operator
        Operators.exampleOfBitwiseOperator(); // bitwise operator
        Operators.exampleOfLogicalOperator(); // logical operator
        Operators.exampleOfTernaryOperator(); // ternary operator
        Operators.exampleOfAssignmentOperator(); // assignment operator
        
        // --------- Decision Making Statements ---------
        DecisionMakingStatements.decisionMakingIfElseStatement(); // if-elseif-else statement
        DecisionMakingStatements.decisionMakingSwitchStatement(); // switch statement

        // -------- Loop Statements --------
        LoopStatements.forLoopStatement(); // for loop statement
        LoopStatements.whileLoopStatement(); // while loop statement
        LoopStatements.doWhileLoopStatement(); // do-while loop statement
    }
}
