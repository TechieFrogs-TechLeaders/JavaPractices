package StringsAssignment;

import java.util.Scanner;

public class NumericString {    //8
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isNumeric = input.matches("\\d+");

        if (isNumeric) {
            System.out.println("The input string is numeric.");
        } else {
            System.out.println("The input string is not numeric.");
        }

        scanner.close();
    }
}
