package OOPS;

public class OuterFromInner {
    int x=120;
    class InnerClass2{
        public int myinnermethod(){
            return x;
        }
    }
}
class OuttoInner{
    public static void main(String[] args) {
        OuterFromInner myOuter=new OuterFromInner();
        OuterFromInner.InnerClass2 myInner=myOuter.new InnerClass2();
        System.out.println(myInner.myinnermethod());
    }
}