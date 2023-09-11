package ExceptionHandling_Assogn;

public class HandleArithmeticException {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 0;
        
           try{
            int div = num1 / num2;
            System.out.println(div);
           }
           catch(ArithmeticException e){
             e.printStackTrace();
           }
       
    }
}
