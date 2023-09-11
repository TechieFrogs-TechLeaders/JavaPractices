public class FirstLetterCaptilize {
    public static void main(String[] args) {
        String str="likhitha";
        String firstletter = str.substring(0,1);
        String remainingLetters = str.substring(1,str.length());
        firstletter = firstletter.toUpperCase();
        str = firstletter + remainingLetters;
        System.out.println("Name:" + str);
    }

}
