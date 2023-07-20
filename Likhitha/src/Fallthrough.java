public class Fallthrough {
    public static void main(String[] args) {
        char ch='f';
        switch (ch) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
         System.out.println("Vowel");
         break;
    default:
        System.out.println("Consonant");
     case 'f','g','h','k','l':
             System.out.println("Consonant");
        }
    }
}