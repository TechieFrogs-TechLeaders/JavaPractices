package StringsAssignment;

public class StringComparision {   //5
 public static void main(String[] args) {
        String str1 = "Steve";
        String str2 = "Steve";
        String str3 = new String("Steve");
        
        // Using == to compare string references
        boolean areEqual1 = str1 == str2;  // True
        boolean areEqual2 = str1 == str3;  // False
        
        System.out.println("Are str1 and str2 equal?: " + areEqual1);
        System.out.println("Are str1 and str3 equal?: " + areEqual2);
    }
}