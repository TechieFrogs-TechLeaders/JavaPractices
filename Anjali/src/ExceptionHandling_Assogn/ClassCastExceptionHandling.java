package ExceptionHandling_Assogn;

import java.util.Scanner;

public class ClassCastExceptionHandling {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        try {
            int str= sc.nextInt();
            System.out.println("String: " + str);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
