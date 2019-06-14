/* 

The following program should allow the user to input as many things as they want until they stop. 
Each time it is supposed to repeat with what the user said, can you fix it?

*/

import java.util.Scanner;

public class LoopDebug {

	public static void main(String[] args) {
	

		
		Scanner keyboard = new Scanner(System.in);
		
        String userInput="";
        
        System.out.println("Enter the text: ");
        
        userInput = keyboard.next();

        while (!userInput.equals("")) {
            
        
            System.out.print(userInput+ " ");
           
            userInput=keyboard.next();

        }
		
	}

}
