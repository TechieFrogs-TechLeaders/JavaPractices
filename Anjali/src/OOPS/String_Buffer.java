package OOPS;

public class String_Buffer {
    public static void main(String[] args) {
        String s4 = "Lady";
        System.out.println("append() & capacity() method & ensure capacity");
        System.out.println("Without string in obj only takes 16 capacity ");
        StringBuffer s1 = new StringBuffer();
       // s1.append("World");
       // System.out.println(s1+" "+s1.length()+" "+s1.capacity());
        s1.append("java is a progremming language");
        System.out.println(s1+" "+s1.length()+" "+s1.capacity());  //old*2+2
        s1.ensureCapacity(30);
        
        StringBuffer s5 = new StringBuffer("java is a progremming language");
        //s5.ensureCapacity(50);
        System.out.println(s5+" "+s5.length()+" "+s5.capacity());

        System.out.println();
        System.out.println("With string in obj takes 16 + String as capacity ");
        StringBuffer s2 = new StringBuffer("World");
        s2.append("World");
        System.out.println(s2+" "+s2.length()+" "+s2.capacity());

        System.out.println();
        System.out.println("With capacity in obj takes capacity if cacity exceeds then changes");
        StringBuffer s3 = new StringBuffer(20);
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
