package ExceptionHandling_Assogn;

public class CatchToHandleChainedException {
    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            // Create a new exception and chain it to the original exception
            throw new RuntimeException("Error occurred during division", e);
        }
    }
    public static void main(String[] args) {
        try {
            
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line will not be reached
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Chained Exception:");
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
        
        System.out.println("Program continues after exception handling.");
    }

}
