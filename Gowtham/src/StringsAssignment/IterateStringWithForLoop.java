package StringsAssignment;

public class IterateStringWithForLoop {    //17
    
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Get the length of the string
        int length = inputString.length();

        // Iterate through each character using a for loop
        for (int i = 0; i < length; i++) {
            char character = inputString.charAt(i);
            System.out.println("Character at index " + i + ": " + character);
        }
    }
}
