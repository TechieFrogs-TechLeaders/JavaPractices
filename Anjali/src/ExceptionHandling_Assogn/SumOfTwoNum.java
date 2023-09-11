package ExceptionHandling_Assogn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first num : " );
        try{
            int num1 =sc.nextInt();

            System.out.println("Enter the second num : ");

            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        }
        catch(InputMismatchException ie){
            System.out.println("Invalid input. Please enter valid input that is integers.");
        }
        finally{
            sc.close();
        }
        
    }
}
