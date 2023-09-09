package ExceptionHandling_Assogn;

public class NegativeArraySizeExceptionHandling {
    public static void main(String[] args) {
        int negativeValue  = -3;
        try{
            int arr[] = new int[negativeValue];
            System.out.println(arr.length);
        }
        catch( NegativeArraySizeException ne){
            System.out.println("NegativeArraySizeException caught: " + ne.getMessage());
        }
        
        
    }
}
