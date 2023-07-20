package BasicAssignment;
public class Vowel {
    public static void main(String[] args) {
       char ch='k';
       switch (ch) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
          System.out.println("Vowel"); 
          break;
          
    case 'f','g','h','k','l':
          System.out.println("Consonant");
    }
   }
}
