package mirza.java.basic.javabasics;

public class LoopStatements {
    // this method is used for representing the example of for loop
    public static void forLoopStatement(){
        int verticalLength = 4;

        for(int i = 1; i <= verticalLength; i++){
            for(int j = verticalLength - i; j > 0; j--){
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // this method is used for representing the example of while loop
    public static void whileLoopStatement(){
        int length = 10;
        int num = 0;

        while(num < length){
            System.out.println("While Loop Iteration: " + num);
            num++;
        }
    }

    // this method is used for representing the example of do-while loop
    public static void doWhileLoopStatement(){
        int i = 0;

        do{
            System.out.println("Do-While Loop Iteration: " + i);
            i++;
        }while (i < 5);
    }
}
