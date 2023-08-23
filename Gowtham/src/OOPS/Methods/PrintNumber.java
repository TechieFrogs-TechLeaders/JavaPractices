package OOPS.Methods;
public class PrintNumber {
   
    public void printn(int num) {
        System.out.println("Integer: " + num);
    }

    public void printn(boolean b) {
        System.out.println("boolean: " + b);
    }

    
    public void printn(double d) {
        System.out.println("Double: " + d);
    }

    public void printn(float f) {
        System.out.println("Float: " + f);
    }
 
    public void printn(long l) {
        System.out.println("Long: " + l);
    }
   
    public void printn(short sh) {
        System.out.println("Short: " + sh);
    }
   
    public void printn(byte by) {
        System.out.println("Byte: " + by);
    }
  
    public void printn(String s) {
        System.out.println("string: " + s);
    }
    
    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber(); 
        obj.printn(10);
        obj.printn(true);
        obj.printn(3.14);
        obj.printn(2.5f);
        obj.printn(10000000000L);
        obj.printn((short) 50);
        obj.printn((byte) 8);
        obj.printn('A');
    }
}