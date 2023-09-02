package StringsAssignment;

public class ReverseString {   //36   
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Call the reverseString method to find the reverse of the string
        String reversedString = reverseString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder(length);

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}