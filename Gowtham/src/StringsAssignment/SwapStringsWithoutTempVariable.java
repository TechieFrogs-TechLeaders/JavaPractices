package StringsAssignment;

public class SwapStringsWithoutTempVariable {   //44
    
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Call the swapStrings method to swap str1 and str2
        swapStrings(str1, str2);

        System.out.println("\nAfter swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    public static void swapStrings(String str1, String str2) {
        // Concatenate the two strings and store the result in str1
        str1 = str1 + str2;

        // Use substring operations to extract the original values
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        // Print the swapped strings (optional)
        System.out.println("\nInside swapStrings method:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
