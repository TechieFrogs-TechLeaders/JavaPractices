package OOPS;

public class Parameter_Con {
    int i, j ;
    String k ;
    Parameter_Con(int a, int b, String c){
        this.i=a;
        this.j=b;
        this.k=c;
    }
    public static void main(String[] args) {
        Parameter_Con myobj = new Parameter_Con(23 , 45 , "Hello world");
        Parameter_Con myobj1 = new Parameter_Con(22 , 32 ,"Water");
        System.out.println(myobj.i+" "+myobj.j+" "+myobj.k);
        System.out.println(myobj1.i+" "+myobj1.j+" "+myobj1.k);
        //System.out.println(myobj.a+" "+myobj.b+" "+myobj.c); cannot use the values/arguments in constructor with obj 
    }
}
