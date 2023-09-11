package ExceptionAssignment;

public class DividebyZero {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try{
        System.out.print(a / b);
        }
        catch(ArithmeticException EE){
        System.out.println(EE);
        
    }
}
}
    
