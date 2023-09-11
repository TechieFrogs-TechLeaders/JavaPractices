package String_Assign;

public class SubsetsOfString {
    public static void main(String[] args) {
        String input = "abc";
        
        System.out.println("Subsets of '" + input + "':");
        generateSubsets(input, 0, "");
    }

    public static void generateSubsets(String input, int index, String currentSubset) {
        int length = input.length();

        // Base case: If the current index is equal to the length of the input string, print the current subset
        if (index == length) {
            System.out.println(currentSubset);
            return;
        }

        // Recursive case:
        // Include the current character in the subset
        generateSubsets(input, index + 1, currentSubset + input.charAt(index));

        // Exclude the current character from the subset
        generateSubsets(input, index + 1, currentSubset);
    }
}
