package Classpractice;

public class TestException {
    public static void main(String[] args) {
        try{
            int div=35/0;
           }
        catch(ArithmeticException a){
            System.out.println(a);
        } 
        System.out.println("exceptional code");
    }
}
