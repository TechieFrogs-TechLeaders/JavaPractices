package Classpractice;

public class ImmutableString {
    public static void main(String[] args) {
        String s="charles";
        s.concat("Xavier");
        String s1=new String("professor");
        System.out.println(s);
        System.out.println(s1);
    }
}
