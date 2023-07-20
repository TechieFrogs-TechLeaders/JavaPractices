package Basicassignment;

public class Vowelorconsonant {
    public static void main(String args[]){
        int m= 66;
        switch(m){
            //Enhanced switch supports multiple case values
            case 'a','A':
            case 'e','E':
            case 'i','I':
            case 'o','O':
            case 'u','U':
            System.out.println("Its a vowel");
            break;
            default:
            System.out.println("Its a consonant");


        }


    }
    
}
