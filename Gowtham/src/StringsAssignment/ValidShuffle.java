package StringsAssignment;

public class ValidShuffle {      //21
    public static boolean isValidShuffle(String str, String str1, String str2) {
        // Base case: If the length of str is not equal to the combined length of str1 and str2, it's not a valid shuffle.
        if (str.length() != str1.length() + str2.length()) {
            return false;
        }

        // If str1 and str2 are empty, str is considered a valid shuffle.
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }

        boolean matchStr1 = !str1.isEmpty() && str.charAt(0) == str1.charAt(0);
        boolean matchStr2 = !str2.isEmpty() && str.charAt(0) == str2.charAt(0);

        if (matchStr1 && matchStr2) {
            return isValidShuffle(str.substring(1), str1.substring(1), str2) ||
                   isValidShuffle(str.substring(1), str1, str2.substring(1));
        }
        else if (matchStr1) {
            return isValidShuffle(str.substring(1), str1.substring(1), str2);
        }
        else if (matchStr2) {
            return isValidShuffle(str.substring(1), str1, str2.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcde";
        String str1 = "ab";
        String str2 = "cde";

        if (isValidShuffle(str, str1, str2)) {
            System.out.println(str + " is a valid shuffle of " + str1 + " and " + str2);
        } else {
            System.out.println(str + " is not a valid shuffle of " + str1 + " and " + str2);
        }
    }
}