import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args) {
        //Q. Create an array to hold 10 numbers
        //. Loop through that array and sum the numbers 1-10, then print that total to the screen.
        Integer[] numbers ={1,2,3,4,5,6,7,8,9,10};
        int total=0;
        for (int i :numbers) {
            total += i;
        }
        System.out.println("The sum of numbers from 1 to 10: " + total);

        //Q.Create an array to hold 10 number inputs from the user and print that total to the screen.
        Scanner sc = new Scanner(System.in);
        String[] input_numbers = new String[10];
        int total_input=0;
        for(int l=0;l<input_numbers.length;l++){
            System.out.print("Enter the 10 numbers: ");
            input_numbers [l]= sc.nextLine();
            total_input +=l;
        }
        System.out.print("Sum of 10 input numbers are : " + total_input);

    //Q. Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.



    }
}
