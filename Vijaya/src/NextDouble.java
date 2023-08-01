import java.util.Scanner;
public class NextDouble{
    public static void main(String[] args) {
        Scanner Scanobj = new Scanner(System.in);
        System.out.print("enter the double valueis:");
        Double value= Scanobj.nextDouble();
        System.out.println("the value enterd is:"+ value);
        Scanobj.close();

    }
}
    

