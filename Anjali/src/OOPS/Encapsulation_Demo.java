package OOPS;

public class Encapsulation_Demo {
    private int num = 56;
    private String s= "Hello";
    boolean b = false;

    public void setNum(int num) {
        this.num = num;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public String getS() {
        return s;
    }

    public boolean isB() {
        return b;
    }

    public int getNum(){
        return num;
    } 

    private int myMethod(){
        System.out.println("my method");
        return num;
    }

    public int setmyMethod(int b){
        System.out.println("Hello");
        return  num = b;
    }
    Encapsulation_Demo(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Encapsulation_Demo myobj = new Encapsulation_Demo();
        System.out.println(myobj.num +" "+myobj.s+" "+myobj.b);
        myobj.myMethod();
    } 
}
