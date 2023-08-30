package Package1;

//import Package2.NewTest; //no need for this

public class Test {
    public int x = 76;
    public static void main(String[] args) {
        System.out.println("One package");

        Package2.NewTest myNewTest = new Package2.NewTest(); //fully Qualified name
        System.out.println(myNewTest.x);
    }
}
