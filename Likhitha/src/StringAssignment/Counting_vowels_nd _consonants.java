import java.util.Scanner;

public class Counting_vowels_nd_consonants {
    public static void main(String[] args) 
System.out.println("Enter a sentence to Classify Consonents,Vowels,Digits,Whitespaces:");
Scanner sc = new Scanner(System.in);
String line = sc.nextline();
int Vowels=0,Digits=0,spaces=0;
//check if character is any of a,e,i,o,u
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
    ++vowels;
}
//check if character between a to z
else if((ch>='a' && ch<='z')){
    ++consonents;
}
System.out.println("Vowels are : " + vowels);
System.out.println("Consonants are : " + consonants);
//System.out.println("spaces are : +spaces");

sc.close();
}
}