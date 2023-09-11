package String_Assign;

public class ValidShuffleCheck {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String shuffled = "worhellold";

        if (isValidShuffle(str1, str2, shuffled)) {
            System.out.println(shuffled + " is a valid shuffle of " + str1 + " and " + str2);
        } else {
            System.out.println(shuffled + " is not a valid shuffle of " + str1 + " and " + str2);
        }
    }

    public static boolean isValidShuffle(String str1, String str2, String shuffled) {
        int i = 0, j = 0, k = 0;

        // Check each character of shuffled in order
        while (k < shuffled.length()) {
            if (i < str1.length() && str1.charAt(i) == shuffled.charAt(k)) {
                i++;
            } else if (j < str2.length() && str2.charAt(j) == shuffled.charAt(k)) {
                j++;
            } else {
                // If the current character in shuffled doesn't match str1 or str2, it's not a valid shuffle
                return false;
            }
            k++;
        }

        // After processing all characters in shuffled, check if both str1 and str2 are also fully processed
        return i == str1.length() && j == str2.length();
    }
}
