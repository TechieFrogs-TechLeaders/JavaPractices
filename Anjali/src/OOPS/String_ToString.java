package OOPS;

public class String_ToString {
    String s ;
    int a;
    /*String_ToString(String s , int a){
        this.s = s;
        this.a = a;
    }*/
    public static void main(String[] args) {
        String_ToString myObj = new String_ToString();
        String_ToString myToString = new String_ToString();

        System.out.println(myObj);
        System.out.println( myToString);
    }
}


class MyNewClass{
    String s = "World";
    int a = 45;

    public String toString(){
        return s+" "+a;
    }

    public static void main(String[] args) {
        MyNewClass Obj = new MyNewClass();
        System.out.println(Obj);
    }

}