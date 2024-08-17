package mirza.java.basic.javabasics;

import java.util.Scanner;

public class TakingInputFromUser {
    static void takingUserInput(){
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in); // Scanner class is used for taking input from user
        String name = scan.next();
        System.out.println("Username: " + name);
    }
}
