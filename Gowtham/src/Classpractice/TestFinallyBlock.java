package Classpractice;

import java.util.InputMismatchException;

public class TestFinallyBlock {
    public static void main(String[] args) {
        int num = "abc"; 
        try{
            int div=25/0;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("input mismatch:");
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
