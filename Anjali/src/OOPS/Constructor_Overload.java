package OOPS;

public class Constructor_Overload {
    int i;
    int j;
    String s;
    Constructor_Overload(){
        this(4);
       System.out.println("Default Constructor");
        i = 34;
        j = 54;
        s = "Hello";
    }
    Constructor_Overload(int a){ //a,b,s are the local variables so by using instance/global variables we are assigning values
        this(3,"hello",67);
         System.out.println("int");
         //this();  constructor calling should be first line in con 
         this.i = a;
    }
    Constructor_Overload(int a,int b){
        this(3,"WOrld"); 
        System.out.println("int and int");
        this.i = a;
        this.j = b;
       
    }
    Constructor_Overload(int a,String s){
        //this() //will be a loop error/recursive at least one should not have this()
        System.out.println("int string");
        this.i = a;
        this.s = s;
    }
    Constructor_Overload(int a,int b,String s){
        this();
        System.out.println("int int string");
        this.i = a;
        this.j = b;
        this.s = s;
    }
    Constructor_Overload(int a,String s,int b){
        this(a,b);//we can also give parameters in it if local
        System.out.println("int string int");
        this.i = a;
        this.j = b;
        this.s = s;
    }
    public static void main(String[] args) {
        Constructor_Overload myobj = new Constructor_Overload(10,76,"World");
        System.out.println(myobj.i+" "+myobj.j+" "+myobj.s);
    }
}
