package Classpratice;
public class Integer {
    //interger program
    static int x=50;
    static
    {
        x=60;
    }
    static final int z;
    static
    {
        z=30;
    }
    int y=45;
    public static void main(String[] args) {
        final int y;
        {
            y=65;
        }
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    
}
