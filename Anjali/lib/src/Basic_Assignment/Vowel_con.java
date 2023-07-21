package Basic_Assignment;

//5.Java Program to Check Whether an Alphabet is Vowel or Consonant
public class Vowel_con {
    public static void main(String[] args) {
        char ch='U';
        if( ch== 'a'||ch=='e' ||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' )
        {
            System.out.println("It is a Vowel :"+ch);
        }
        else{
            System.out.println("It is a Consonent :"+ch);
        }

    }
    
}
