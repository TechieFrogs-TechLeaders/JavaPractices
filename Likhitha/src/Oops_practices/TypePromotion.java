package Oops_practices;

public class TypePromotion {
    public static void main(String[] args) {
        byte b = 23;
        char c = 'a';
        short s = 2345;
        int i = 12345;
        float f = 625f;
        double d = 556.77;
int result = (int) ((f * b)+(d / c)-(d * c));
System.out.println("Result" +result);
    }
}
