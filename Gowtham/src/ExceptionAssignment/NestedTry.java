package ExceptionAssignment;

public class NestedTry {
    
    public static void main(String[] args) {
        try {
            System.out.println("Outer Try Block - Before Exception");
            int result = 100;
              int[] arr = new int[3];
            int value = arr[5];
            try {
                System.out.println("Inner Try Block - Before Exception");
                result = divide(100, 20); 
                System.out.println("Inner Try Block - After Exception"); 
            } 
            catch (ArithmeticException innerException) {
                System.out.println("Inner Catch Block: " + innerException.getMessage());
            }
            System.out.println("Outer Try Block - After Inner Try-Catch"); 
            System.out.println("Result of Division: " + result);
        } 
        catch (Exception outerException) {
            System.out.println("Outer Catch Block: " + outerException.getMessage());
        }
        System.out.println("Outside Try-Catch Blocks");
    }
   
    public static int divide(int a, int b) {
        return a / b;
    }
}
