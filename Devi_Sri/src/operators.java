public class operators {
    public static void main(String[] args){
        int a=10;
        int b=50;
        int c=20;
        boolean d=true;
        boolean e=false;
    System.out.println(a++);//10  postfix
    System.out.println(--b);//49  prefix
    System.out.println(a); //11
    System.out.println(a--);//11   post fix
    System.out.println(a++ + b--);//59    10+49
    System.out.println(a++ + c--);//31    11+20
    System.out.println(a + " "+ b + " "+c);
    System.out.println(a++ + ++b + --c + b++);//128  12+50+18+48
    System.out.println(a++ + c++);//31  13+18
    System.out.println(a++ - b++ + c++);//-17   14-50+19
    System.out.println(c++ + c--);//41  20+21
    System.out.println(a-- + a++);//29   15+14
    System.out.println(a++ + b-- + c++);//86    15+51+20
    System.out.println(a-- + b++);//66    16+50
    System.out.println(a++ - b-- + c++ + a--);//1  15-51+21+16
    System.out.println(a++ - b++ + c-- + a++);//3  15-50+22+16
    //unary negation
    System.out.println(a+" "+~-a);//17 16 
    //bitwise compliment or negation
    System.out.println(!d);//false
    System.out.println(!e);//true
    
    }
    
}
