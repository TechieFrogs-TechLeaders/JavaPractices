package ExceptionHandling_Assogn;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 0 };
        
        for (int i = 0; i < numbers.length; i++) {
            try {
                int result = divide(10, numbers[i]);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
