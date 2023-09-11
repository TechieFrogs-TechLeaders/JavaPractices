package Classpractice;

public class StringBufferEx {   //StringBuffer append() method ex
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("hello ");
       StringBuffer sb1=new StringBuffer();

        sb.append("world");
        sb.insert(1,"world");
        sb.replace(1,3,"world");
        sb.delete(1, 3);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb1.capacity());
        sb1.append("hello");
        System.out.println(sb1.capacity());
        sb1.append("Hello World is the basic code in any programming language");
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(20);
        System.out.println(sb1.capacity());

    }
}
