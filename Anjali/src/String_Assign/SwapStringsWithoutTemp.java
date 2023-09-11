package String_Assign;

public class SwapStringsWithoutTemp {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swap the strings using the concat method  //or can use "+"
        str1 = str1.concat(str2);
        System.out.println(str1);
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}

