package OOPS;

public class Exception_New {
    
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        try {
            performOperation(10);
            performOperation(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }

    public static int performOperation(int value) throws IllegalArgumentException, ArithmeticException {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        if (value == 0) {
            throw new ArithmeticException("Cannot perform operation with zero.");
        }
        return 100 / value;
    }
}

