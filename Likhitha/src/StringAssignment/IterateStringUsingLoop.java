public class IterateStringUsingLoop {
    public static void main(String[] args) {
        String str="Signitives";
        
        System.out.println("Characters in " + str + " are:");
        for (int i=0; i<str.length(); i++){
    
        char a = str.charAt(i);
      System.out.print(a + ", ");
    }
    }
    
}
