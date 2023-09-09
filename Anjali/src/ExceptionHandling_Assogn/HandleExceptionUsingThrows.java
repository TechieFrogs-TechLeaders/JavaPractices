package ExceptionHandling_Assogn;

public class HandleExceptionUsingThrows {
   public static void main(String[] args) {
        int age = -13;
        
        if( age < 0 ){
            throw new IllegalArgumentException("Age cannot be negative");
        }
   }
}
