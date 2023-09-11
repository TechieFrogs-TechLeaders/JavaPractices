package ExceptionAssignment;

import java.util.Scanner;

public class MultipleExceptionHandlingDemo {
    public static void main(String[] args) {
        MultipleExceptionHandlingDemo demo = new MultipleExceptionHandlingDemo();
        try {
            demo.accessArrayOutOfBounds(); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
    public void accessArrayOutOfBounds() {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to access from the array (0 to 2): ");
            int index = scanner.nextInt();
            
            if (index < 0 || index >= numbers.length) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds for length " + numbers.length);
            }
            
            int value = numbers[index];
            System.out.println("Value: " + value);
            
            System.out.print("Enter a divisor for arithmetic operation: ");
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


