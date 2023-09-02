package String_Assign;

import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("Total number of characters in the string: " + str.length());

        sc.close();
    }
}
