package StringsAssignment;

public class CheckSubstringWithIndexOf {     //20   
    public static void main(String[] args) {
        String mainString = "This is a sample string.";
        String substring = "sample";

        // Check if the mainString contains the substring using indexOf()
        int index = mainString.indexOf(substring);

        if (index != -1) {
            System.out.println("The mainString contains the substring: " + substring);
        } else {
            System.out.println("The mainString does not contain the substring: " + substring);
        }
    }
}

