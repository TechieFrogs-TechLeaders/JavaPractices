package String_Assign;

public class CheckStringIsNumeric {
    public static void main(String[] args) {
        String str = new String("hello");

        if(isNumeric(str)){
            System.out.println(str + " is a numeric string.");
        } else {
            System.out.println(str + " is not a numeric string.");
        }
        }


    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
