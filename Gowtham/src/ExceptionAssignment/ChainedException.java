package ExceptionAssignment;

public class ChainedException {
        public static void main(String[] args) {
            try {
                int result = divide(10, 0);
            } catch (RuntimeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
                Throwable rootCause = e.getCause();
                if (rootCause != null) {
                    System.out.println("Root Cause: " + rootCause.getMessage());
                }
            }
        }
        public static int divide(int a, int b) {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                throw new RuntimeException("Division by zero occurred", e);
            }
        }
    }
    
