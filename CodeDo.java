import java.util.Scanner;

public class CodeDo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double loan = 0;
        double interest = 0;
        double monthlyPayment = 0;
        double balance = 0;
        int term;

        System.out.println("Enter the loan amount: ");
        loan = keyboard.nextDouble();

        System.out.println("Enter the interest rate on the loan: ");
        interest = keyboard.nextDouble();

        System.out.println("Enter the term (years) for the loan payment: ");
        term = keyboard.nextInt();

        System.out.println("\n======================================\n");
        keyboard.close();

        monthlyPayment = processSomething(loan, interest, term);
        balance = -(monthlyPayment*(term*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
    }


    private static double processSomething(double loan, double interest, int term) {
        // calculates the monthly payment
        double rate = (interest/ 100) / 12;
        double base = (1 + rate);
        double months = term* 12;
        double result ;
        result = ((rate * loan) / (1 - Math.pow(base, -months)));

        return result;
    }
}
