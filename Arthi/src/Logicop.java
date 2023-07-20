public class Logicop {
    static int a=16, p=-20;
    static char c='M';
    static double b=2346789d;

    public static void main(String args[]){
        float n=2034.789f;
        short s=24;
        long m=1230987L;
        byte o=4;
        System.out.println("Logical operators can only used between the conditions");
        System.out.println(a>b&&b>c);
        System.out.println(n>s&&m>o);
        System.out.println(n>s||m>o);
        System.out.println(n>c||s>m);
        System.out.println(p>o&&c>n);
        







        
    }
    
}
