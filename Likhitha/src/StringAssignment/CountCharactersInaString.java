public class CountCharactersInaString {
    public static void main(String[] args) {
        String str = "This is Happy World";
        int count = 0;

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) !=' ')
            count++;
        }
        System.out.println("Total Number of Characters in a String:" +count);

    }
}
