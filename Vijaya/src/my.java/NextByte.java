import java.util.Scanner;
public class NextByte{
    public static void main(String[] args) {
        Scanner Scanobj = new Scanner(System.in);
        System.out.print("enter the number you want");
        Byte num=Scanobj.nextByte();
        System.out.println("output value"+(num*(num+2))/2);
        Scanobj.close();
    }
}
    

