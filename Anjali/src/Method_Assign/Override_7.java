package Method_Assign;

class A2{
    int i;
    public void printNum(){
        System.out.println("i:" + i);
    }
}
class B1 extends A2{
    int j;
    public void printNum(){
        System.out.println("j:" + j);
    }
}

public class Override_7 {
    public static void main(String[] args) {
        B1 myobj = new B1();
        myobj.i = 45;
        myobj.j = 87;
       myobj.printNum();
    }
}
