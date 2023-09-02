package String_Assign;

import java.util.Scanner;

public class StringComparisionUsingEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First String:");
        String string1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();

        if(string1 == string2){
            System.out.println("The both strings are same value and reference and same obj");
        }
        else{
            System.out.println("The strings value is diff and of diff object");
        }

        sc.close();
    }
}
