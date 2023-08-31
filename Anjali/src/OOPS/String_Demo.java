package OOPS;

public class String_Demo {
    
    public static void main(String[] args) {

    String s = "Hello";
    String s1 = "Hello";//string literal
    String s4 = "Hello";
    String c = "Beautiful";

    String s5 = new String("zello");
    String s2 = new String("Hello"); //string object
    String s3 = new String("hello");   
    System.out.println(s);
    
    System.out.println("Strings are immutiable:");
    s.concat("Team");
    System.out.println(s);  //not changed because is has not changed but new obj/instance is created so must assign to new string/same string 

    s = s.concat(s1);
    System.out.println(s);

    System.out.println("String Comparision methods :");

    System.out.println("equals() method :"+s.equals(s1));
    System.out.println("equals() method :"+s1.equals(s2));
    System.out.println("equals() method case sensitive:"+s1.equals(s3));

    System.out.println("equalsIgnoreCase():"+s1.equalsIgnoreCase(s3));//not case sensitive

    System.out.println();
    System.out.println("== operator  compares references");
    System.out.println(s1 == s3); //one belong to literal referance and other belong to obj
    System.out.println(s1 == s4); //both reference to same instance  (both instances )

    System.out.println();
    System.out.println("CompareTo() method:");
    System.out.println("s1=s2:"+s1.compareTo(s2)); //both are same so "0"
    System.out.println("s>s1 so +ve :"+s.compareTo(s1)); 
    System.out.println("s1<s so -ve :"+s1.compareTo(s));
    System.out.println("s1<s5 so -ve :"+s1.compareTo(s5));
    System.out.println("Case sensitive one cap one small :"+s1.compareTo(s3));
    System.out.println("not Case sensitive for compareToIgnoreCase:"+s1.compareToIgnoreCase(s3));

    System.out.println();
    System.out.println("Concatination with "+" operator  and concat() method");
    System.out.println("Beautiful" + "Day");
    System.out.println("concat() method :"+ c.concat(" Day"));

    System.out.println();
    System.out.println("Substring() method:");
    System.out.println(s.substring(4)); //starts from 4 //start index is included
    System.out.println(s.substring(0,9));//end index is excluded
    }
}
