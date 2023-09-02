package String_Assign;

public class IterateThroughCharacters {
    public static void main(String[] args) {
        String str = new String("This is the a new begnning");

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
        }
    }
}
