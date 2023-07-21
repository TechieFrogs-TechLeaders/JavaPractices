package BasicAssignment;

public class Alphabetornot {
     public static void main(String[] args){
        char c='A';
        if((c>='a' && c<='z')  ||  (c>='A'&& c<='Z'))
            System.out.println("alphabet");
        else
            System.out.println("not an alphabet");//ascii values A-Z=65to90,a-z=97to122
        
     }
    
}
