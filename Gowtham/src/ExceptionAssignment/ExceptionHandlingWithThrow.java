package ExceptionAssignment;

import java.util.Scanner;

public class ExceptionHandlingWithThrow {   
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            if (num % 2 == 0) {
                throw new UnsupportedOperationException("Even numbers are not supported.");
            }
           // int result = num / 0;
           // System.out.println(result);
            System.out.println("You entered a valid odd positive integer: " + num);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
