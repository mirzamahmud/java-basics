package mirza.java.basic.javabasics;

import java.util.Scanner;

public class DecisionMakingStatements {

    // this method is used to if-then-else statement
    public static void decisionMakingIfElseStatement(){
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;

        if(firstNumber > secondNumber & firstNumber > thirdNumber){
            System.out.println(firstNumber + " is Greater");
        }else if(secondNumber > firstNumber & secondNumber > thirdNumber){
            System.out.println(secondNumber + " is Greater");
        }else {
            System.out.println(thirdNumber + " is Greater");
        }
    }

    // this method is used to switch statement
    public static void decisionMakingSwitchStatement(){
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println("---------------- Simple Calculator ---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("--------------------------------------------------");

        // take input from user
        System.out.print("Enter your choice: ");
        Scanner readUserChoice = new Scanner(System.in);
        int userChoice = readUserChoice.nextInt();
        System.out.println("");

        switch (userChoice){
            case 1:
                System.out.println("Addition: " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Subtraction: " + (secondNumber - firstNumber));
                break;
            case 3:
                System.out.println("Multiplication: " + (firstNumber * secondNumber));
                break;
            case 4:
                System.out.println("Division: " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("No Option Available");
                break;
        }
    }
}
