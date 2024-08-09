package mirza.java.basic.javabasics;

public class JumpStatements {

    // this method is used to give an example of break statement
    public static void breakStatement(){
        int i = 0;

        while(i < 10){
            System.out.println("Iteration: " + i);
            i++;

            if(i == 5){
                break;
            }
        }
    }

    // this method is used to give an example of continue statement
    public static void continueStatement(){
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println("Continue Iteration: " + i);
        }
    }
}
