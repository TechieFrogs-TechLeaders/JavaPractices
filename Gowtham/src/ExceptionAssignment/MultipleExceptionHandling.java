package ExceptionAssignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
    MultipleExceptionHandling demo = new MultipleExceptionHandling();
            try {
            demo.divideByZero(); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: " + e.getMessage());
        }
    }
    public void divideByZero() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}