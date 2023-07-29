import java.util.Scanner;
public class Vallidation2{
    public static void main(String[] args) {
        String str = "java platform!3*8=24";
        Scanner Scanobj = new Scanner(System.in);
        while(Scanobj.hasNext()) {
            boolean status = Scanobj.hasNextInt();
            System.out.println("Scanobj.nextInt(): "+ status);
            status = Scanobj.hasNextInt(2);
            System.out.println("Scanobj.NextInt(2): " + status);
            Scanobj.next();
        }
        Scanobj.close();

        }
}
