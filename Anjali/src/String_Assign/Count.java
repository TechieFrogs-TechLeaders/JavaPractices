package String_Assign;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();
        
        int  vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        for(int i = 0; i < sentence.length() ; i++){
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                if(ch == 'a' || ch == 'e' || ch  == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }    
            else if(Character.isDigit(ch)){
                digitCount++;
            } 
            else if(Character.isWhitespace(ch)){
                spaceCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Space count: " + spaceCount);
    
    scanner.close();
    }
    
}
