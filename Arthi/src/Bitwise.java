public class Bitwise {
    public static void main(String  args[]){
        int a=10;
        int b=20; 
        int c=30;
        float d=40.0f;
        double m=2345.678d;
        long n=908765343L;
        char e='s';
        byte g=4;
        short s1=9;
        //bitwise AND/OR Operators
        System.out.println(a>b&b>c);
        System.out.println(b>a|c<b);
        //convert a and b values as a binary code and perform operations
        //we can perform AND/OR operations for float values
        System.out.println("a&b = " + (a & b));
        System.out.println(10|20);
        System.out.println(c>b&d<c);
        //checking OR operation conditions for boolean values
        System.out.println("For bitwise OR if one condition is true it is true otherwise false");
        System.out.println(true|false);
        System.out.println(false|false);
        System.out.println(false|true);
        System.out.println(true|true);
        System.out.println("For bitwise AND if both conditions are true it is true otherwise false");
        System.out.println(true&false);
        System.out.println(true&true);
        System.out.println(false&false);
        System.out.println(false&true);
        //we can do AND/OR operations for double and long
        System.out.println(a>m|m>b);
        System.out.println(n>m&m<a);
        System.out.println(e>a|e>c);
        System.out.println(n>e&m>e);
        System.out.println(m>s1&n>e);
        System.out.println(g>s1&a>b);
        System.out.println(g>e&n>g);
        System.out.println(a>d&n>g);
        System.out.println(n|e);
        //System.out.println(a|d);
        //Here the operations between int and float are not working when directly taking variables
        System.out.println("a= " + a);
        

        
        
        


        

        
    }
    
    
}
