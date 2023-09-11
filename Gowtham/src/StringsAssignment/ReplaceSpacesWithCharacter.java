package StringsAssignment;

public class ReplaceSpacesWithCharacter {  //32
    
public static void main(String[] args) {
        String inputString = "This is a string with spaces.";
        char replacementChar = '-';

        String stringWithReplacement = inputString.replaceAll(" ", String.valueOf(replacementChar));

        System.out.println("Original String: " + inputString);
        System.out.println("String with spaces replaced: " + stringWithReplacement);
    }
}