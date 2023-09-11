package Oops_practices;

public class Chaining {
      public static final String ClassOne = null;
    public static final String ClassTwo = null;
      public  int a = 10;
        float f = 3.5f;
         boolean b = false;
 public Chaining(){
    this(4);
    System.out.println("Parameter");
 }
 Chaining(int a){
    this(4,4.4f);
    System.out.println("int");
 }
 Chaining(int a ,float f){
    this(4,4.4f,true);
    System.out.println("int float");
 }
 Chaining(int a,float f,boolean b){
    System.out.println("int float boolean");
 }
 
 Chaining(int a,boolean b,float f) {
    this();
    System.out.println("int float boolean");
    this.a=a;
    this.b=b;
    this.f=f;
 }
 public static void main(String[] args) {
    Chaining classObject = new Chaining(4,8.8f,true);
    System.out.println(classObject.a+" "+classObject.b+" "+classObject.f);
 }
}




