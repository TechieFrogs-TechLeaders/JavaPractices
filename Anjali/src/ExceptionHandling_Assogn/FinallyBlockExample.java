package ExceptionHandling_Assogn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
         try{
                int num = sc.nextInt();
                System.out.println(num); 
            }
            catch( InputMismatchException ie)
            {
                System.out.println(ie);
            }
            finally{
                sc.close();
            }

    }
}
