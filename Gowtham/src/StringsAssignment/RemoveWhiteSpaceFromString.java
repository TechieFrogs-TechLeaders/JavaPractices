package StringsAssignment;

public class RemoveWhiteSpaceFromString {   //30
    public static void main(String[] args) {
        String inputString = "This is a string with spaces.";

        // Remove white spaces using replaceAll()
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");

        System.out.println("Original String: " + inputString);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}
