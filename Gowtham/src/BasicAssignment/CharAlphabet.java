package BasicAssignment;
// program to check whether a character is alphabet or not
public class CharAlphabet {
    public static void main(String[] args) {
        char c = 'A';
        if((c>='a' && c <='z') || (c>='A' && c<= 'z'))
        System.out.println(c+ " is an alphabet");
        else
        System.out.println(c+" is not an alphabet");
    }
    
}
