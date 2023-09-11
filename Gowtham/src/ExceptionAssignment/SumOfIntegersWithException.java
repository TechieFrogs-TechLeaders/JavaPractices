package ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegersWithException {   
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers."+e);
        } finally {
            scanner.close();
        }
    }
}
