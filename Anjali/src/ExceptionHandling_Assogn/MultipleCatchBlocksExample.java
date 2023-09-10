package ExceptionHandling_Assogn;

public class MultipleCatchBlocksExample {
    public static void main(String[] args) {
        String numericString = "42";
        String nonNumericString = "Hello";
        try {
            
            int result = divide(10, 0);
            System.out.println(result);

            int numericValue = Integer.parseInt(numericString);
            System.out.println("Parsed integer value: " + numericValue);

            
            int nonNumericValue = Integer.parseInt(nonNumericString); 
            System.out.println("Parsed integer value (non-numeric): " + nonNumericValue);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
