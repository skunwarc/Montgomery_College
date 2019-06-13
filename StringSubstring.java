import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.next();
        System.out.println("Enter a number as an index: ");

        int number = sc.nextInt();
        System.out.println("The length of alphabet is : "+ word.length());

        if(number > word.length()){
            System.out.println("Index is larger than length.");
        }else {
            System.out.println(" The substring from 0 to " + number + " is: " + word.substring(0, number));
        }
        }
}
