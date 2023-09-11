package OOPS;

public class String_Builder {
    public static void main(String[] args) {
        String s4 = "Lady";
        System.out.println("append() & capacity() method & ensure capacity");
        System.out.println("Without string in obj only takes 16 capacity ");
        StringBuilder s1 = new StringBuilder();
       // s1.append("World");
       // System.out.println(s1+" "+s1.length()+" "+s1.capacity());
        s1.append("java is a progremming language");
        System.out.println(s1+" "+s1.length()+" "+s1.capacity());  //old*2+2
        s1.ensureCapacity(30);
        
        StringBuilder s5 = new StringBuilder("java is a progremming language");
        //s5.ensureCapacity(50);
        System.out.println(s5+" "+s5.length()+" "+s5.capacity());

        System.out.println();
        System.out.println("With string in obj takes 16 + String as capacity ");
        StringBuilder s2 = new StringBuilder("World");
        s2.append("World");
        System.out.println(s2+" "+s2.length()+" "+s2.capacity());

        System.out.println();
        System.out.println("With capacity in obj takes capacity if cacity exceeds then changes");
        StringBuilder s3 = new StringBuilder(20);
        s3.append("World");
        System.out.println(s3+" "+s3.length()+" "+s3.capacity());
        s3.append("dddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        System.out.println(s3+" "+s3.length()+" "+s3.capacity()); //increases as capacity same as the string since same string

        System.out.println();
        System.out.println("insert() method");
        System.out.println(s1.insert(0,'k'));
        System.out.println(s1.insert(3,"World"));

        System.out.println();
        System.out.println("replace() method");
        System.out.println(s4.replace("L","hi"));
        System.out.println(s4.replace("a","Welcome"));

        System.out.println();
        System.out.println("delete() method");
        System.out.println(s1.delete(0, 4));
        System.out.println("deleteCharAt only delets single char :"+s1.deleteCharAt(3));//deletes single char

        System.out.println();
        System.out.println("reverse() method");
        System.out.println("reverse() reverse the entire strig : "+s2.reverse());
    }
}
