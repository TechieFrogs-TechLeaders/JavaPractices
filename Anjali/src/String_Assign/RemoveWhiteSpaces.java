package String_Assign;

public class RemoveWhiteSpaces {

    static String myMethod(String string1){
        return string1.replaceAll("\\s","");
    }
    public static void main(String[] args) {
        String str = "Hello there who are you";
        
        String result = myMethod(str);
        System.out.println("Original String: " + str);
        System.out.println("String with white spaces removed: " + result);
    }
}
