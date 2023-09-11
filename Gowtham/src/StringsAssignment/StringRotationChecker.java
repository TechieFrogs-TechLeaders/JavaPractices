package StringsAssignment;

public class StringRotationChecker {     //34
        public static void main(String[] args) {
            String str1 = "abcdefg";
            String str2 = "efgabcd";
    
            // Call the isRotation method to check if str2 is a rotation of str1
            boolean isRotation = isRotation(str1, str2);
    
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            if (isRotation) {
                System.out.println("String 2 is a rotation of String 1.");
            } else {
                System.out.println("String 2 is not a rotation of String 1.");
            }
        }
    
        public static boolean isRotation(String str1, String str2) {
            // Check if both strings have the same length and are not empty
            if (str1.length() != str2.length() || str1.length() == 0) {
                return false;
            }
            String concatenatedString = str1 + str1;
            return concatenatedString.contains(str2);
        }
    }
