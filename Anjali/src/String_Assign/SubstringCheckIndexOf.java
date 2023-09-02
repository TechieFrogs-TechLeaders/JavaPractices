package String_Assign;

public class SubstringCheckIndexOf {
    public static void main(String[] args) {
        
    String str = "Hello World";
    String str1 = "World";

    int indexOfSubstring = str.indexOf(str1);

    if(indexOfSubstring != -1){
        System.out.println("The mainString contains the substring.");
        System.out.println("The substring starts at index " + indexOfSubstring);
     }
    else {
            System.out.println("The mainString does not contain the substring.");
    }

}
}