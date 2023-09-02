package String_Assign;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        
        // Reverse the string using a loop
        String reversedString = reverseWithLoop(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseWithLoop(String input) {
        // Create an empty string to store the reversed characters
        String reversed = "";
        
        // Iterate through the original string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        return reversed;
    }
}

