package ExceptionHandling_Assogn;

public class CustomeCheckedException extends Exception{
    CustomeCheckedException(String s){
        super(s);
    }
}

class Child{
    public static void main(String[] args) {
        try {
            
            throw new CustomeCheckedException("This is a custom checked exception.");
        } catch (CustomeCheckedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception.");
    }
}
