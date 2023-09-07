package Array_Assign;

public class CharToStringConversion {
    public static void main(String[] args) {
        char charcter = 'C';

        char ch[] = { 'a', 'e', 'i', 'o', 'u'};

        String str1 = String.valueOf(ch);
        String st2 = new String(ch); //taking ch as parameter to constructor
        System.out.println("Converting array to string : "+str1);
        System.out.println(st2);

        String str = Character.toString(charcter);

        System.out.println("Char to String : " + str);

        String st = "Hello";

       // String st1 = "A";
        if (st.length() == 1) {
            char stringToChar = str.charAt(0);
            System.out.println("String to Character: " + stringToChar);
        } else {
            System.out.println("String cannot be converted to a single character.");
        }
    }
}
