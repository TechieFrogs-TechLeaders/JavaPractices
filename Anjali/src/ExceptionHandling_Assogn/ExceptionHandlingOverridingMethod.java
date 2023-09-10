package ExceptionHandling_Assogn;

class ExceptionClass{
    void display(int num1, int num2) throws IllegalAccessException{
        try{
            int result = num1 / num2;
            System.out.println(result);
        }catch(IllegalArgumentException ie){
        System.out.println(ie);
        }
}
        
}

public class ExceptionHandlingOverridingMethod extends ExceptionClass{
    void display(int num1, int num2) throws ArithmeticException{
        try{
            if(num2 == 0){
            int div = num1 / num2;
            System.out.println(div);
        }
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        
    }
    public static void main(String[] args) {
        ExceptionHandlingOverridingMethod obj = new ExceptionHandlingOverridingMethod();
        obj.display(3,0);
    }
}
