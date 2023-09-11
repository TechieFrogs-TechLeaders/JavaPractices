package ExceptionHandling_Assogn;

public class CatchMultipleExceptionTypes {
    public static void main(String[] args) {
        try{
             String s = "23gf";

            int number = Integer.parseInt(s);
            System.out.println(number);
            
            int arr[] = { 1, 2, 3};
            System.out.println(arr[5]);

            int num = 45/0;

            System.out.println(num);

        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndexOutOfBoundsException " + ae.getMessage());
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException " + ae.getMessage());
        }
        catch(NumberFormatException ne){
            System.out.println("NumberFormatException " + ne.getMessage());
        }
        catch(Exception e){
            System.out.println("Generic exception: " + e.getMessage());
        }
    }
}
