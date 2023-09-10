package ExceptionHandling_Assogn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchFinallyExample {
    public static void main(String[] args) {
        String numericString = "42";
        String nonNumericString = "Hello";
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Outer try block: Start");

            try {
                System.out.println("Inner try block: Start");
                int result = divide(10, 2); // Division
                System.out.println("Result of division: " + result);

                try{
                    int numericValue = Integer.parseInt(numericString);
                    System.out.println("Parsed integer value: " + numericValue);

            
                    int nonNumericValue = Integer.parseInt(nonNumericString); 
                    System.out.println("Parsed integer value (non-numeric): " + nonNumericValue);
                }
                catch (NumberFormatException e) {
                System.out.println("NumberFormatException caught: " + e.getMessage());
                }
                    try{
                        int num = sc.nextInt();
                        System.out.println(num); 
                    }
                    catch( InputMismatchException ie){
                        System.out.println(ie);
                    }


            } catch (ArithmeticException e) {
                System.out.println("Inner ArithmeticException caught: " + e.getMessage());
            }
            finally {
                System.out.println("Inner finally block: Cleanup");
                //sc.close();
            }

            System.out.println("Outer try block: End");
        } catch (Exception e) {
            System.out.println("Outer Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block: Cleanup");
            sc.close();
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
