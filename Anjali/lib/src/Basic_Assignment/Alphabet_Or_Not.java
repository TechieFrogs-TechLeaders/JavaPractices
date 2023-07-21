package Basic_Assignment;

//7.Java Program to Check Whether a Character is Alphabet or Not
public class Alphabet_Or_Not {
    public static void main(String[] args) {
        char ch='y';//y=121
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println(ch+" is an Alphabet");//A=65,Z=90,a=97,122
        }
        else{
            System.out.println(ch+"is not an Alphabet");
        }
    }
    
}
