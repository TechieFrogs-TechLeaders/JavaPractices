package Oops_practices;

public class StringDemo {
            private String s;

            public static void main(String[] args) {

    String s="Happy";//string literal
    String s1="Happy";//doesn't create new instance
    String s2="Happy";
    //s= s.concat("Weekend");//imutable strings
   String ch = "strings";
         System.out.println(s);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s);
      System.out.println(ch);
        StringDemo cObj = new StringDemo();
        StringDemo cObj1 = new StringDemo();
        cObj1.s="sad";
     System.out.println(s.equals(s1));//by equals method
     System.out.println(s1.equals(s2));
     System.out.println(s2.equals(ch));
     System.out.println(cObj1.s==s1);//== operators
     System.out.println(s==ch);
     System.out.println(s==s1);
     System.out.println(s.compareTo(s1));//by compare to method
     System.out.println(s1.compareTo(ch));
        

        
    }

    
    }
    
