package StringsAssignment;

public class StringEqual {
    public static void main(String[] args) {  //6
    String str1 = "Steve";
    String str2 = "Steve";
    String str3 = new String("Steve");
    
    // Using equals() to compare string contents
    boolean areEqual1 = str1.equals(str2);  // True
    boolean areEqual2 = str1.equals(str3);  // True
    
    System.out.println("Are str1 and str2 equal? " + areEqual1);
    System.out.println("Are str1 and str3 equal? " + areEqual2);
}
}
