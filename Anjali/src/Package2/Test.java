package Package2;

public class Test {
    int x  = 45;
    Test(){
        System.out.println("Test");
    }
    public static void main(String[] args) {
        Test myTest = new Test();
        System.out.println("Packag2 same package"+myTest.x);

        Package1.Test myTest2 = new Package1.Test();
        System.out.println(myTest2.x);
    }
}
