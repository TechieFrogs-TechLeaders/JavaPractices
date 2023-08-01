import java.util.Scanner;
 public class Scan {
    public static void main(String[] args) {
        Scanner Scanobj=new Scanner(System.in);
        System.out.println("Enter your name");
        // Read the first token
        String name = Scanobj.nextLine();
        System.out.println("Name is:"+name);
        Scanobj.close();
    }
}
