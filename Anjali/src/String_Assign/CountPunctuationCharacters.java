package String_Assign;

public class CountPunctuationCharacters {

    static int countPunctuation(String str){
        int punctuationCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                punctuationCount++;
            }
        }
        
        return punctuationCount;
    }
    public static void main(String[] args) {

        String str = "Hello, World! This is a test.";
        //int PunctuationCount = 
        int punctuationCount = countPunctuation(str);
        
        System.out.println("Total number of punctuation characters in the string: " + punctuationCount);

    }
}
