package ExceptionHandling_Assogn;

public class IllegalArgumentExceptionHandling {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int balance = 400;
        try {
            if( balance < 1000){
                throw new IllegalArgumentException();
            }

            int result = num1 / num2; // Attempt to divide by zero
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
