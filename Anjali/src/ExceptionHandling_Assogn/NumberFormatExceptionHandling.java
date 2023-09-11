package ExceptionHandling_Assogn;

public class NumberFormatExceptionHandling {
    public static void main(String[] args) {
        String numericString = "42";
        String nonNumericString = "Hello";

        try {
            int numericValue = Integer.parseInt(numericString);
            System.out.println("Parsed integer value: " + numericValue);

            // Attempt to parse a non-numeric string
            int nonNumericValue = Integer.parseInt(nonNumericString); // This will throw NumberFormatException
            System.out.println("Parsed integer value (non-numeric): " + nonNumericValue);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
