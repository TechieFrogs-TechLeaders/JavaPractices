package StringsAssignment;

public class SubsetsOfString {  //27
    
    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("Subsets of \"" + inputString + "\":");
        generateSubsets(inputString, 0, "");
    }

    public static void generateSubsets(String str, int index, String currentSubset) {
        // Base case: If we have processed all characters in the string, print the current subset.
        if (index == str.length()) {
            System.out.println(currentSubset);
            return;
        }

        // Include the current character in the subset and move to the next character.
        generateSubsets(str, index + 1, currentSubset + str.charAt(index));

        // Exclude the current character from the subset and move to the next character.
        generateSubsets(str, index + 1, currentSubset);
    }
}