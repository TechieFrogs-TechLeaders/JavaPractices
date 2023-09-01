package StringsAssignment;

public class StringObjects {
    public static void main(String[] args) {    //7
        String str1 ="Hello";
        String str2 = new String("Hello");
        String str3 = new String("Hello");

        // Using == to compare String objects
        boolean result1 = (str1 == str2); // false (they are separate objects)
        boolean result2 = (str1 == str3); // false (separate objects)

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
    }
}
