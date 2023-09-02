package StringsAssignment;

public class CountPunctuationCharacters {   //23
    public static void main(String[] args) {
        String inputString = "Hello, World! This is a sample string with some punctuation.-";

        // Call the countPunctuationCharacters method to count punctuation characters
        int punctuationCount = countPunctuationCharacters(inputString);

        System.out.println("Total number of punctuation characters in the string is: " + punctuationCount);
    }

    public static int countPunctuationCharacters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isLetterOrDigit(character)) {
                // Skip letters and digits
                continue;
            }
            // Check if the character is a punctuation character
            if (Character.isWhitespace(character)) {
                // Skip whitespace characters
                continue;
            }
            count++;
        }

        return count;
    }
}

