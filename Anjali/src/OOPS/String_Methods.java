package OOPS;

public class String_Methods {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s4 = " what ";
        String s5 = "java is a programming language ,java is a platform";
        
        String s3 = new String("HELLO");

        System.out.println("Upper & Lower methods");
        System.out.println(s1.toUpperCase());
        System.out.println(s3.toLowerCase());

        System.out.println();
        System.out.println("trim() method:");
        System.out.println(s4);
        System.out.println(s4.trim());

        System.out.println();
        System.out.println("startsWith() & endsWith() methods :");//gives true or false
        System.out.println("startsWith():"+s1.startsWith("H"));
        System.out.println("startsWith():"+s1.startsWith("o"));
        System.out.println("endsWith() :"+s2.endsWith(s3));
        System.out.println("endsWith() :"+s2.endsWith("ld"));

        System.out.println();
        System.out.println("charAt() method :");
        System.out.println(s3.charAt(3));
        System.out.println("White space :"+s4.charAt(0));

        System.out.println();
        System.out.println("Length() method:");
        System.out.println(s4.length());

        System.out.println();
        System.out.println("valueOf() method:");
        double f = 3.4;
        String s = String.valueOf(f);
        System.out.println(s+8.9); //valueof converts to string
 
        System.out.println();
        System.out.println("replace() method:");
        System.out.println(s1.replace("H","k"));
        System.out.println(s5.replace("java","kava"));
        System.out.println(s5.replaceFirst("java","kava"));//changes the first value only
        System.out.println(s5.replaceFirst("is","i"));

        System.out.println();
        System.out.println("codePointAt() method:");
        System.out.println(s1.codePointAt(0));
        System.out.println(s2.codePointAt(3));

        System.out.println();
        System.out.println("codePointAt() method:");
        System.out.println(s1.codePointAt(0));
        System.out.println(s2.codePointAt(3));
    }
}
