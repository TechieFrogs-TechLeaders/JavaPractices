package ExceptionHandling_Assogn;

public class NestedTryStatemet {
    public static void main(String[] args) {

        try{
            try{
            String s = "Hello";
            char ch = s.charAt(6);
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException se){
            System.out.println(se.getMessage());
            String s = "Hello";
            char ch = s.charAt(2);
            System.out.println("The value at the index : " +ch);
        }
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        
    }
}
