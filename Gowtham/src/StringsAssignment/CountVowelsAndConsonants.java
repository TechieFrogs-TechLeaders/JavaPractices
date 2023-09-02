package StringsAssignment;

public class CountVowelsAndConsonants {     //24
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Call the countVowelsAndConsonants method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputString);

        int vowelCount = counts[0];
        int consonantCount = counts[1];

        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of consonants: " + consonantCount);
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the input string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isLetter(character)) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    // If the character is a vowel, increment the vowel count
                    vowelCount++;
                } else {
                    // If the character is a consonant, increment the consonant count
                    consonantCount++;
                }
            }
        }

        int[] counts = { vowelCount, consonantCount };
        return counts;
    }
}
