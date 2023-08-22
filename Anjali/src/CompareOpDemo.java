public class CompareOpDemo {
    static int a=2,b=4,i=8;
    static float f=3.8f;
    static double d=8.7;
    static char c='A',g='B';
    static char z='!';
    public static void main(String[] args) 
    {
        long l=9477777777777l;
        byte e=-3;
        //short s=-9;
        //boolean b1=true;
       // boolean b2=false;
        System.out.println("For integers all compareop;");
        System.out.println("For int : "+(a==b));
        System.out.println(a>~i);
        System.out.println("a:"+a+"   i:"+i);//i value have not changed

        System.out.println(a!=b);
        System.out.println(b!=i);
        System.out.println(++a==b);
        System.out.println(b--!=i);
        System.out.println(a>b--);
        System.out.println(i<b);
        System.out.println(a<=--b);
        System.out.println(i>=++b);
        System.out.println(l>a);
        //int and floating values
        System.out.println("a:"+a+"  "+"b: "+b+"  "+"i:"+" "+i);
        System.out.println("int and float :"+(a==f));
        System.out.println(i!=d);
        System.out.println(d--==++f);
        System.out.println(d>=--i);
        System.out.println(d>a);
        System.out.println(d<=--l);
        //int char
        System.out.println("int and char :"+ (a==c));
        System.out.println(a>=--c);
        System.out.println(g-->=i);
        System.out.println("a:" +a+"  "+"c:"+c);
        System.out.println(a>=~c);
        System.out.println("a:" +a+"  "+"c:"+c);
        //int floating values
        System.out.println("floating values:"+(f>=d++));
        System.out.println(f!=i);
        System.out.println(d>=--b);
        /*//int boolean  
        System.out.println("boolean and int :"+(b1>=a));
        System.out.println(i==b2);
        comparision operator is undifined for Boolean*/

        //floating and negative values
        System.out.println("int and neg:"+(e==--i));
        System.out.println(i>=++a);

        //floatin values and char
        System.out.println("floating and char: "+(f!=c));
        System.out.println(g>=d--);
        System.out.println(z==f);






    
}
}