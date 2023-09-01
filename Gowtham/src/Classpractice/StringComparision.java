package Classpractice;

public class StringComparision {
    public static void main(String[] args) {
        String s1="peter";
        String s2="peter";
        String s3=new String("peter");
        String s4="parker";
        String s5="PETER";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
