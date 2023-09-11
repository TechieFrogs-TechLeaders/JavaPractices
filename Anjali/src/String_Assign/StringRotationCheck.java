package String_Assign;

public class StringRotationCheck {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (isRotation(str1, str2)) {
            System.out.println("'" + str2 + "' is a rotation of '" + str1 + "'.");
        } else {
            System.out.println("'" + str2 + "' is not a rotation of '" + str1 + "'.");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        // Check if the lengths are the same and not empty
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}
