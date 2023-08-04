package Basic_Assignment;

//13.Java Program to Display Characters from A to Z using loop
public class A_Z_Char {
    public static void main(String[] args) {
        char ch;
        
        for(ch='A';ch<='z';ch++){
            System.out.println(ch);
        }


        for(ch='A';ch<='Z';ch++){
            System.out.println("Upper case letters: "+ch);
        }
        
        char c='a';
        while(c<='z'){
            System.out.println("Lowercase Letters :"+c);
            c++;
        }
        
    }
    
}
