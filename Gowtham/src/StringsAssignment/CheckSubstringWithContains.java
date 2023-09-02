package StringsAssignment;

public class CheckSubstringWithContains {     //19
    public static void main(String[] args) {
        String mainString = "This is a sample string.";
        String substring = "sample";

        // Check if the mainString contains the substring
        boolean containsSubstring = mainString.contains(substring);

        if (containsSubstring) {
            System.out.println("The mainString contains the substring: " + substring);
        } else {
            System.out.println("The mainString does not contain the substring: " + substring);
        }
    }
}
