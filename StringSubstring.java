Q. 
Create a program that will allow users to enter a word, and a character number index. Your program will print out the size of the word,
as well as the substring (starting from 0) to the index the user specified. If the user entered index is larger than the size of the word,
the program will print "Index is larger than length".



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
