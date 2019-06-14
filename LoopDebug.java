import java.util.Scanner;

public class LoopDebug {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput="";
        userInput = keyboard.next();

        while (!userInput.equals("") {
            
        
            System.out.println(userInput);
            System.out.println("Do you want to continue: (Y/N)?");
            userInput=keyboard.next();

        }

    }
}
