import java.util.Scanner;

public class LoopDebug {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput;


        while (true) {
            System.out.println("Input the things you want: ");
            userInput = keyboard.next();
            //System.out.println("Input the things you want: ");


            System.out.println(userInput);
            System.out.println("Do you want to continue: (Y/N)?");
            userInput=keyboard.next();

        }

    }
}
