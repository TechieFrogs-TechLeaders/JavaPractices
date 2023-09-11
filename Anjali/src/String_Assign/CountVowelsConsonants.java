package String_Assign;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "Hello, World!";
       // input = input.toLowerCase(); // Convert the input to lowercase for case-insensitive counting
        
        // Count the total number of vowels and consonants in the string
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(character)) {
                // Check if the letter is a vowel
                if (isVowel(character)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Total number of vowels in the string: " + vowelCount);
        System.out.println("Total number of consonants in the string: " + consonantCount);
    }

    public static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}
