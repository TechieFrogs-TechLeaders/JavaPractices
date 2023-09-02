package String_Assign;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";

        // Find and print duplicate characters
        findAndPrintDuplicates(input);
    }

    public static void findAndPrintDuplicates(String input) {
        System.out.println("Duplicate characters in the string:");

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean Duplicate = false;

            // Check if the current character is already seen
            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == currentChar) {
                    Duplicate = true;
                    break;
                }
            }

            // If the current character is not a duplicate, check for duplicates after it
            if (!Duplicate) {
                for (int k = i + 1; k < input.length(); k++) {
                    if (input.charAt(k) == currentChar) {
                        System.out.println(currentChar);
                        break;
                    }
                }
            }
        }
    }
}
