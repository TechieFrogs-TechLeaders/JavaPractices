package StringsAssignment;

public class SeparateCharactersFromString {   //43
    
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        // Call the separateCharacters method to separate individual characters
        char[] characters = separateCharacters(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Individual Characters:");

        for (char c : characters) {
            System.out.print(c + " ");
        }
    }
    public static char[] separateCharacters(String str) {
        char[] characters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        return characters;
    }
}
