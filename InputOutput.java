import java.util.Scanner;

public class InputOutput
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;

        System.out.print( "First number: " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second number: " );
        num2 = keyboard.nextDouble();

        double average = (num1 +num2)/2;

        System.out.println("The average value is : " + average);
    }
}
