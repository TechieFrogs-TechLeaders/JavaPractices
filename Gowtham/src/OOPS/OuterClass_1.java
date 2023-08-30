package OOPS;

public class OuterClass_1 {
    static int outerx = 10;
    int outery = 20;
    private int outerPrivate = 30;

    public void outerMethod() {
        int outerz=45;
        int outerk=65;
        class LocalInnerClass {
            void display() {
                System.out.println("outerx=" + outerx);
                System.out.println("outery=" + outery);
                System.out.println("outerprivate=" + outerPrivate);
                System.out.println("outerz="+outerz);
                System.out.println("outerk"+outerk);
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
}

class InnerClass {
    public static void main(String[] args) {
        OuterClass_1 outerObject = new OuterClass_1();
        outerObject.outerMethod();
       // System.out.println(outerz);
       //System.out.println("outerk"+outerk);
    }
}