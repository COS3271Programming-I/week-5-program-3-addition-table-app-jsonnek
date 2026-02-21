// Jonathan Sonnek
// February 20th 2026
// Addition Table APP

import java.util.Scanner;
public class Main {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        // get user input for the size of the addition table
        System.out.print("Enter a number from 3 to 20: ");
        int number = Integer.parseInt(userinput.nextLine());

        // loop to validate user input and ensure it's between 3 and 20
        while (number < 3 || number > 20) {
            try {
                number = Integer.parseInt(userinput.nextLine());
                if (number < 3 || number > 20) {
                    System.out.print("Invalid input. Please enter a number from 3 to 20: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number from 3 to 20: ");
            }
        }

        // print the header row of the addition table
        System.out.printf("%4s", "+");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int row = 1; row <= number; row++) {
            System.out.printf("%4d", row);
            for (int colum = 1; colum <= number; colum++) {
                System.out.printf("%4d", row + colum);
            }
            System.out.println();
        }
    }
}