package String_Assign;

public class SeparateCharactersFromString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println("Individual characters from the string:");

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            
            System.out.println(ch);
        }
    }
}
