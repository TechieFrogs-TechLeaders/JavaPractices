package Classpractice;

public class StringOperator {
    public static void main(String[] args) {
        int a=39;
        String s="charles"+"Xavier";
        String s1="james";
        String s2=" james ";
        String s3=new String("james");
        String s4="JAMES ";
        String s5="BARNES";
        String s6="sai surya";
        String s7=s4.concat(s5);
        String s8=String.valueOf(a);
        String s9="Spider is an inscet.Spider crawls on the walls.Spider can regenerate limbs";
        String replaceString=s9.replace("Spider","Lizard");

        System.out.println(replaceString);
        System.out.println(s8+39);
        System.out.println(s);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s5));
        System.out.println(s3.compareTo(s1));
        System.out.println(s5.compareTo(s3));
        System.out.println(s5.compareTo(s6));
        System.out.println(s6.compareTo(s4));

        System.out.println(s7);
        System.out.println(s6.substring(3));
        System.out.println(s6.substring(0, 6));
        System.out.println(s6.toUpperCase());
        System.out.println(s7.toLowerCase());

        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s6.toUpperCase());
        System.out.println(s7.startsWith("JA"));
        System.out.println(s7.endsWith("es"));
        System.out.println(s4.charAt(2));
        System.out.println(s4.charAt(3));
        System.out.println(s4.length());

       
    }
}
