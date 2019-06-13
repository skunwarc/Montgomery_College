import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of days in a month: ");
        int month = sc.nextInt();
        String monthName;
        switch (month) {
            case 31:  monthName = "January March May July August October December";
                break;
            case 30:  monthName = "February April June September November";
                break;
            default: monthName = "No months have exactly "+ month+ " days";
                break;
        }
        System.out.println(monthName);
    }
}
