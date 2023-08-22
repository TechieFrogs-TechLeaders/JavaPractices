package OOPS;

public class Chaining {
    int a = 6;
    double d = 3.9;
    boolean b = true;
    Chaining(){
        this(4);
        System.out.println("Default");
    }
    Chaining(int a){
        this(5,7.7);
        System.out.println("int");
    }
    Chaining(int a, double d){
        this(5 , 5 , false );
        System.out.println("int double");
    }
    Chaining(int a, double d, boolean b){
        System.out.println("int double boolean");
    }
    Chaining(int a, boolean b, double d){
        this();
        System.out.println("int boolean double");
        this.a = a;
        this.b = b;
        this.d = d;
    }
    public static void main(String[] args) {
        Chaining myobj = new Chaining(4,true,56);
        System.out.println(myobj.a+" "+myobj.b+" "+myobj.d);

    }
}
