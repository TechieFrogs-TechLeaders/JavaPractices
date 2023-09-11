package ExceptionAssignment;
import java.io.*;

public class ThrowException {
    

    static void validate(int age) {
        if(age<18)
        throw new ArithmeticException("not valid");
        else
        System.out.println("Welcome to Vote");
    }
    public static void main(String[] args) {
        validate(13);
        System.out.print("rest of the code");
    }
}
 

