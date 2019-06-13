Q. Write a program that uses a while loop to prompt the user 
to enter any number of exam scores 
and the resulting program will print out the grade, A, B, C, D or F.

If you're finished:
Modify your program to print + or - after the grade. 
A+ 97 to 100
A 94 to 96
A- 90 to 93
B+ 87 to 89
B 84 to 86
B- 80 to 83
C+ 77 to 79
C 74 to 76
C- 70 to 73
D 60 to 69
Go back to School if you get below 60


import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {

        Scanner  sc= new Scanner(System.in);
        String anotherscores="y";

        while (anotherscores.equalsIgnoreCase("y")){
            System.out.print("Enter an exam score: ");
            int scores = sc.nextInt();

            if (scores >= 97 && scores < 100) {
                System.out.println("Good job. Your grade is A+. ");
            } else if (scores >= 94 && scores <97) {
                System.out.println("Good job. Your grade is A.");
            } else if (scores >= 90 && scores <94) {
                System.out.println("Good job. Your grade is A-.");
            } else if (scores >= 87 && scores <90) {
                System.out.println("Good job. Your grade is B+.");
            } else if (scores >= 84 && scores <87) {
                System.out.println("Good job. Your grade is B.");
            } else if (scores >= 80 && scores <84) {
                System.out.println("Good job. Your grade is B-.");
            } else if (scores >= 77 && scores <80) {
                System.out.println("Good job. Your grade is C+.");
            } else if (scores >= 74 && scores <77) {
                System.out.println("Good job. Your grade is C.");
            } else if (scores >= 70 && scores <74) {
                System.out.println("Good job. Your grade is C-.");
            } else if (scores >= 60 && scores <70) {
                System.out.println("Good job. Your grade is C-.");
            } else {
                System.out.println("Go back to school if you get below 60.");
            }
            System.out.println("Do you want to enter another score (Y/N)?");
            anotherscores = sc.next();
        }
    }
}
