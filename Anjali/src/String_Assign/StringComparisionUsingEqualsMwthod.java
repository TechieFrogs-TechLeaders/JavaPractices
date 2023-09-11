package String_Assign;

import java.util.Scanner;

public class StringComparisionUsingEqualsMwthod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First String:");
        String string1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();

        String string3 = "Hello";
        String string4 = "hello";

        System.out.println(string1.equals(string2));
        System.out.println(string3.equals(string4));

        sc.close();
    }
}
