package OOPS;

class ConstructorOverload{
    int i;
    int j;
    String s;
    ConstructorOverload(){
        this(12);
        System.out.println("default constructor");
        i=11;
        j=24;
        s="hello";
    }
    ConstructorOverload(int a){
        this(99,"edward",22);
        System.out.println("int");//
        this.i=a;
    }
    ConstructorOverload(int a, int c, String s){
        System.out.println("int,int,string");
        this.i=a;
        this.j=c;
        this.s=s;
    }
    ConstructorOverload(int c,String s){
        this(10,789,"potion");
        System.out.println("int,string");
        this.j=c;
        this.s=s;
    }
    ConstructorOverload(String s,int c,int a){
        this(10);
        System.out.println("string,int,int");//
        this.s=s;
        this.j=c;
        this.i=a;
    }
    ConstructorOverload(int a,String s,int c){
        this(55,"snap");
        System.out.println("int,string,int");//
        this.s=s;
        this.i=a;
        this.j=c;
    }
    public static void main(String[] args) {
      ConstructorOverload obj=new ConstructorOverload("yosh",30,17);
      System.out.println(obj.i+" "+obj.j+" "+obj.s);
    }
}