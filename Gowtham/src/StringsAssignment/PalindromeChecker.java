package StringsAssignment;

public class PalindromeChecker {    //33
    
    public static void main(String[] args) {
        String inputString = "racecar";

        // Call the isPalindrome method to check if the string is a palindrome
        boolean isPalindrome = isPalindrome(inputString);

        System.out.println("Input string: " + inputString);
        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
