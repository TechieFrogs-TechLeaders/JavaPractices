package Package2;

//import Package1.Sub_Package.Sub;

public class NewTest {
    public int x = 4;
    public static void main(String[] args) {
        System.out.println("package2");

        //from Sub_Package
        Package1.Sub_Package.Sub mySub = new Package1.Sub_Package.Sub(); //fully Qualified field
        System.out.println(mySub.x);
    }
}
