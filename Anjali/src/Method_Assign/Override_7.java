package Method_Assign;

class A{
    int i;
    public void printNum(){
        System.out.println("i:" + i);
    }
}
class B extends A{
    int j;
    public void printNum(){
        System.out.println("j:" + j);
    }
}

public class Override_7 {
    public static void main(String[] args) {
        B myobj = new B();
        myobj.i = 45;
        myobj.j = 87;
       myobj.printNum();
    }
}
