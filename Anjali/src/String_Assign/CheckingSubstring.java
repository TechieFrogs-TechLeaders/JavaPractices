package String_Assign;

public class CheckingSubstring {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "World";

        boolean check = str.contains(str1);

        if (check) {
            System.out.println("The mainString contains the substring.");
        } else {
            System.out.println("The mainString does not contain the substring.");
        }
    }
}
