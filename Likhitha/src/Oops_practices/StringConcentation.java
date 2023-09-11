package Oops_practices;

public class StringConcentation {
    public static void main(String[] args ) {
    String s = "Happy";
    String s1 = "Week";
    String s2 = "Multi" + "Talent";//concentation
    String s3 = s.concat(s1);//concat method
    String s4 = "sachin";
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s.substring(4));//SUB STRING
    System.out.println(s1.substring(0,4));
    System.out.println(s.toUpperCase());//class methods
    System.out.println(s.toLowerCase());
   // System.out.println(s4);//trim()
   // System.out.println(s4.trim());//no space
    
    System.out.println(s4.startsWith("sa"));//ends with and starts with
    System.out.println(s4.endsWith("n"));
    System.out.println(s1.charAt(0));//char At methods
    System.out.println(s4.charAt(4));
    System.out.println(s1.length());//length()
    
    }       
}
